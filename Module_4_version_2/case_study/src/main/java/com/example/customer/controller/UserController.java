package com.example.customer.controller;

import com.example.customer.entity.AppRole;
import com.example.customer.entity.AppUser;
import com.example.customer.entity.UserRole;
import com.example.customer.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new AppUser());
        return "/register";
    }

    @PostMapping("/registered")
    public String rege(@ModelAttribute AppUser user, @RequestParam("secondPassword") String secondPassword) {
        if (user.getUserName().equals(userService.findByUser(user.getUserName())) ||
                user.getEncrytedPassword().equals(secondPassword)) {
            return "register";
        } else {
            UserRole userRole = new UserRole();
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            String pass = bCryptPasswordEncoder.encode(user.getEncrytedPassword());
            AppRole appRole = new AppRole();
            appRole.setRoleId((long) 1);
            userRole.setAppUser(user);
            userRole.setAppRole(appRole);
            user.setEncrytedPassword(pass);
            userService.save(user);
        }
        return "/index";
    }
}
