package com.ist411.memes.controllers;

import com.ist411.memes.models.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {
    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String getLogin(Model model){
        model.addAttribute("user", new UserDto());
        return "login";
    }

    /*@RequestMapping(method = RequestMethod.POST, value = "/login")
    public ModelAndView login(@ModelAttribute("user") @Valid UserDto accountDto,
                        BindingResult result,
                        WebRequest request,
                        Errors errors) {
        return new ModelAndView("global","user", accountDto);
    }*/
}
