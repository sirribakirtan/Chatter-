package com.chatter.chatter.controllers;

import com.chatter.chatter.models.appModels.User;
import com.chatter.chatter.models.enums.Gender;
import com.chatter.chatter.models.enums.Language;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    public String getHomePage(Model model) {
        User user = new User("Anil", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        User f1user = new User("Sırrı", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        User f2user = new User("Anil", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        User f3user = new User("Anil", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        User f4user = new User("Anil", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        user.getFriendList().add(f1user);
        user.getFriendList().add(f2user);
        user.getFriendList().add(f3user);
        user.getFriendList().add(f4user);
        model.addAttribute("user", user);
        model.addAttribute("messageReceiver", f1user);
        System.out.println(user);
        return "pages/home";
    }

}
