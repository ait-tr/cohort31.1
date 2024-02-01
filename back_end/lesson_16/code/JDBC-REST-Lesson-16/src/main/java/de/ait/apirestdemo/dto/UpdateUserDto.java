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
@Schema(name = "Update User", description = "Fields for update")
public class UpdateUserDto {
    private String name;
    private String email;
    private String password;
    private String role;
}
