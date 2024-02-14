package de.ait.fitlio.controller;

import de.ait.fitlio.dto.FitlioDto;
import de.ait.fitlio.dto.NewUserDto;
import de.ait.fitlio.dto.StandardResponseDto;
import de.ait.fitlio.dto.UserDto;
import de.ait.fitlio.service.UserService;
import de.ait.fitlio.validation.dto.ValidationErrorsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tags (@Tag (name = "Users"))
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Operation(summary = "Get list of users", description = "Available for ADMIN only")
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity
                .ok(userService.getAllUsers());
    }

}
