package com.ist411.memes.controllers;

import com.ist411.memes.models.User;
import com.ist411.memes.services.IUserService;
import com.ist411.memes.services.UserService;
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
@RequestMapping(value = "/signup")
public class SignUpController {

    private final UserService service;

    public SignUpController(){
        service = new UserService();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showRegistrationForm(WebRequest request, Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView registerUserAccount(
            @ModelAttribute("user") @Valid User account,
            BindingResult result,
            WebRequest request,
            Errors errors) {

        User registered = new User();
        if (!result.hasErrors()) {
            registered = createUserAccount(account, result);
        }
        if (registered == null) {
            result.rejectValue("email", "message.regError");
        }
        if (result.hasErrors()) {
            return new ModelAndView("registration", "user", account);
        }
        else {
            return new ModelAndView("successRegister", "user", account);
        }
    }
    private User createUserAccount(User account, BindingResult result) {
        User registered = null;
        try {
            registered = service.registerNewUserAccount(account);
        } catch (IUserService.EmailExistsException e) {
            return null;
        }
        return registered;
    }
}
