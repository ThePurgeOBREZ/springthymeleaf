package com.wldrmnd.socialnetwork.controller;

import com.wldrmnd.socialnetwork.model.Cadet;
import com.wldrmnd.socialnetwork.repo.CadetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private CadetRepo cadetRepo;

    @GetMapping("/register")
    public String form(Model model) {
        Cadet cadet = new Cadet();
        model.addAttribute("cadet", cadet);

        List<String> roleList = Arrays.asList("Курсант", "Преподаватель");
        model.addAttribute("roleList", roleList);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("cadet") Cadet cadet) {
        System.out.println(cadet);
        cadetRepo.save(cadet);
        return "register_success";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Cadet> getAllCadets() {
        return cadetRepo.findAll();
    }












}
