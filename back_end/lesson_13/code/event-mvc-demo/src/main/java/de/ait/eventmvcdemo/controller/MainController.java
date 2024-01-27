package de.ait.eventmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getEventHomePage(Model model){
        model.addAttribute("pageTitle", "Home page");
        return "home";
    }

    @GetMapping("/about")
    public String getAboutPage(Model model){
        model.addAttribute("pageAbout", "About");
        return "about";
    }

}
