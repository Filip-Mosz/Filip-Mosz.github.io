package com.github.filipmosz.MyGithubWebsite.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    Map<String, String> attributes = new HashMap<>();

    @RequestMapping("/home")
    public String getHome(Model model) {

        return "index";
    }

}
