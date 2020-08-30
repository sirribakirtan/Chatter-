package com.chatter.chatter.controllers;

import com.chatter.chatter.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    @GetMapping("")
    public String getSignUpPage(Model model) {
        Person person = new Person();
        model.addAttribute("person",person);
        return "pages/signup";
    }

    @PostMapping("")
    public String register(@Valid @ModelAttribute("person") Person person, Errors errors, Model model) {
        System.out.println(person.getEmail());
        if (errors.hasErrors()) {
            return "pages/signup";
        } else {
            model.addAttribute("message", "Registration successfully...");
            return "pages/signup";
        }

    }
}
