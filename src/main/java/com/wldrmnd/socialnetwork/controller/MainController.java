package com.wldrmnd.socialnetwork.controller;


import com.wldrmnd.socialnetwork.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/register")
    public String form(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> jobList = Arrays.asList("Developer", "Teacher", "Architect");
        model.addAttribute("jobList", jobList);
        return "register_form";
    }

    /**
     * submit the form from get-register end-point using thymeleaf model
     *
     * @param user
     * @return some string value
     */
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success";
    }


}
