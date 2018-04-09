package com.ist411.memes.controllers;

import com.ist411.memes.models.Post;
import com.ist411.memes.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeedController {

    private final PostRepository postRepo;

    @Autowired
    public FeedController(PostRepository postRepository){
        this.postRepo = postRepository;
    }

    @RequestMapping(value = "/global", method = RequestMethod.GET)
    public String getGlobal(Model model){
        model.addAttribute("posts",postRepo.findAll());
        return "global-feed";
    }

    @RequestMapping(value ="/all")
    public @ResponseBody
    Iterable<Post> getAllUsers() {
        // This returns a JSON or XML with the users
        return postRepo.findAll();
    }
}
