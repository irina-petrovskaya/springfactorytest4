/*
 * Copyright (c) 2018
 */

package com.mytests.springboot.autoconfiguration.bundle4usage.usemyautoconfigurationbundle4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 4/9/2018.
 * Project: springfactorytest4
 * *******************************
 */
@Controller
public class HomeController {
    @org.springframework.web.bind.annotation.RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "home_attr1");
        return "home";
    }

    @RequestMapping("/missing")
    public String missing(ModelMap model) {
        model.addAttribute("missing_attr1", "missing_attr1");
        return "missing";
    }
}
