package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {

    @RequestMapping("/home") // add mapping for home
    public String home(Model model) {
        System.out.println("home page handler");

        // Sending data to view
        model.addAttribute("name", "Rajesh Developer");
        model.addAttribute("Youtube", "RRCode");
        model.addAttribute("Github", "https://github.com/Rajesh9977");

        return "home"; // looks for home.html or home.jsp depending on template engine
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About page loading");
        return "about";
    }

    // services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Service page loading");
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/signup")
    public String signupPage() {
        return "signup";
    }
}
