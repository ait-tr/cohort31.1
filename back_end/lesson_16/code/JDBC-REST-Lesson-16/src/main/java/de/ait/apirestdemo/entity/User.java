package de.ait.apirestdemo.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
}
