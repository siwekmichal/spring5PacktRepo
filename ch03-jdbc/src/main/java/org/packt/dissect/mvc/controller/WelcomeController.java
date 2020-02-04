package org.packt.dissect.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome.html")
    public String getWelcomePage(){
        return "welcome";
    }
}
