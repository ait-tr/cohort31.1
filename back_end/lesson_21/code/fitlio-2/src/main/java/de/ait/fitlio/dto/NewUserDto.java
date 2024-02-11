package de.ait.fitlio.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class NewUserDto {
    @Email
    @NotNull
    @Schema(description = "User email", example = "user@mail.com")
    private String email;

    @NotNull
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
    @Schema(description = "User password", example = "Qwerty007!")
    private String password;

    @NotNull
    @Schema(description = "User nickname", example = "User007")
    private String name;

}
