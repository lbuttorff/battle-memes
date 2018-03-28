package com.ist411.memes.controllers;

import com.ist411.memes.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/signup")
public class SignUpController {

    @RequestMapping(method = RequestMethod.GET)
    public String getSign(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String signUp(@ModelAttribute("user") @Valid User user) {

        // implement your own registration logic here...
        return "login";
    }
}
