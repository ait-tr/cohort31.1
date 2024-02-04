package de.ait.apirestdemo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "New user", description = "How to add new user")
public class NewUserDto {
    @Schema(description = "User name", example = "Leonid")
    private String name;
    @Schema(description = "User email", example = "leon@mail.com")
    private String email;
    @Schema(description = "User password", example = "Qwerty123#")
    private String password;
    @Schema(description = "User role", example = "USER, ADMIN")
    private String role;
}
