package com.ist411.memes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GlobalFeedController {

    @RequestMapping(value = "/global", method = RequestMethod.GET)
    public String getGlobalFeed(){
        return "global-feed";
    }
}
