package de.ait.apirestdemo.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private String name;
    private String email;
    private String password;
    private String role;
}
