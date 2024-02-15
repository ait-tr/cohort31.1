package de.ait.fitlio.security.config;

import de.ait.fitlio.security.handler.*;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@EnableMethodSecurity(securedEnabled = true, prePostEnabled = true, proxyTargetClass = true)
public class SecurityConfig {

    UserDetailsService userDetailsService;

    public static final String LOGIN_ENDPOINT = "/api/login";
    public static final String LOGOUT_ENDPOINT = "/api/logout";

    private static final String[] AUTH_WHITELIST = {
            "/api/v1/auth/**",
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/api/user/me/**",
            "/api/auth/register",
            LOGIN_ENDPOINT,
            LOGOUT_ENDPOINT
    };

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))

                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(AUTH_WHITELIST).permitAll()
                        .requestMatchers(HttpMethod.POST, "/api/auth/register").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginProcessingUrl(LOGIN_ENDPOINT)
                        .successHandler(new AuthenticationSuccessHandler())
                        .failureHandler(new AuthFailureHandler())
                )
                .exceptionHandling(exception -> exception
                        .defaultAuthenticationEntryPointFor(new AuthenticationEntryPointHandler(), new AntPathRequestMatcher("/api/**"))
                        .accessDeniedHandler(new AuthAccessDeniedHandler())
                )
                .logout(logout -> logout
                        .logoutUrl(LOGOUT_ENDPOINT)
                        .logoutSuccessHandler(new SignOutSuccessHandler())
                );

        return http.build();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authUser) throws Exception {
        authUser.userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
    }
    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
