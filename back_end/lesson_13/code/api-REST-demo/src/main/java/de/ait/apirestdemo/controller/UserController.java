package de.ait.apirestdemo.controller;

import de.ait.apirestdemo.dto.NewUserDto;
import de.ait.apirestdemo.dto.UserDto;
import de.ait.apirestdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    // методы для работы с пользователем (mvc)

    @PostMapping("/register")
    public String addUser(NewUserDto newUser){
        userService.addUser(newUser);
        return "redirect:/success_page.html";
    }

    @GetMapping("/home")
    public String getHomePage(Model model){
        return "redirect:home.html";
    }

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<UserDto> users = userService.getAllUsers();
        model.addAttribute("userList", users); // связываем данные и их представление в шаблонизаторе
        return "users_page";
    }

}
