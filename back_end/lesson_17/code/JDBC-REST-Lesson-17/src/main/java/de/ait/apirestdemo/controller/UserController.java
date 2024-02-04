package de.ait.apirestdemo.controller;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UpdateUserDto;
import de.ait.apirestdemo.dto.UserDto;
import de.ait.apirestdemo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
public class UserController {

    private final UserService userService; // DI

    @Operation(summary = "Get all users", description = "For admin only ")
    @GetMapping("/users")
    @ResponseBody
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @Operation(summary = "Add new user", description = "For Admin only")
    @PostMapping("/users")
    @ResponseBody
    public UserDto add(@RequestBody NewUserDto newUser){
        return userService.addUser(newUser);
    }

    @Operation(summary = "Get one user by id", description = "Available for all users")
    @GetMapping("/{user-id}")
    public UserDto getUserById (@Parameter(description = "user id", example = "5")
                                    @PathVariable("user-id") Long id){
        return userService.getUser(id);
    }

    @Operation(summary = "Delete user", description = "For Admin only")
    @DeleteMapping("/{user-id}")
    public UserDto deleteUser(@Parameter(description = "user id", example = "1")
                              @PathVariable("user-id") Long id) {
        return userService.deleteUser(id);
    }

    @Operation(summary = "Update user", description = "For Admin only")
    @PutMapping("/{user-id}")
    public UserDto updateUser(@Parameter(description = "user id", example = "1")
                              @PathVariable("user-id") Long id,
                              @RequestBody UpdateUserDto updateUser) {
        return userService.updateUser(id, updateUser);
    }

}
