package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class PageController {
    @RequestMapping("/home")
    public String getHomePage(){
        System.out.println("home page is comming now......");
        return "home";
    }
    
    // About page

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("Calling about page endPoint");
        return "about";
    }

    // Services page

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Calling services page endPoint");
        return "service";
    }
}
