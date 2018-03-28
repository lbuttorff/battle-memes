package com.ist411.memes.controllers;

import com.ist411.memes.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String getLogin(){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(){
        //Validate user login, return to Global Feed
        return "global-feed";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    public String getPostsPage(){
        return "posts";
    }
}
