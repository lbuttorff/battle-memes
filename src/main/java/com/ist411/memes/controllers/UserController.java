package com.ist411.memes.controllers;

import com.ist411.memes.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/signin")
    public String getSignIn(){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signin")
    public String signIn(){
        //Validate user login, return to Global Feed
        return "global-feed";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    public String getPostsPage(){
        return "posts";
    }
}
