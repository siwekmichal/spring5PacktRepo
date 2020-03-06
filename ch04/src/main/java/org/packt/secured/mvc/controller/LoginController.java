package org.packt.secured.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value = {"/login.html"}, method = RequestMethod.GET)
    public String login(@RequestParam(name = "error", required = false) String error, Model model) {
        try {
            if (error.equalsIgnoreCase("true")) {
                String errorMsg = "Login Error";
                model.addAttribute("errorMsg", errorMsg);
            }else{
                model.addAttribute("errorMsg", error);
            }
        } catch (NullPointerException e) {
            return "login_form";
        }

        return "login_form";
    }

    @RequestMapping("/logout.html")
    public String logout(){
        return "logout_form";
    }

    @RequestMapping("/after_logout.html")
    public String afterLogout(){
        return "after_logout_form";
    }

    @RequestMapping("logerr.html")
    public String logger(){
        return "logger_form";
    }

    @RequestMapping(value = {"/login_form.html"}, method = RequestMethod.GET)
    public String login_form(@RequestParam(name="error", required = false) String error, Model model){
        try {
            if (error.equalsIgnoreCase("true")){
                String errorMsg = "Login Error";
                model.addAttribute("errorMsg", errorMsg);
            } else {
                model.addAttribute("errorMsg", error);
            }
        } catch (NullPointerException e){
            return "login_form_url";
        }
        return "login_form_url";
    }

    @RequestMapping(value = {"/after_logout_url.html"}, method = RequestMethod.GET)
    public String adterLogoutUrl(){
        return "after_logout_url";
    }
}
