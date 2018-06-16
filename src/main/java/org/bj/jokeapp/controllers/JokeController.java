package org.bj.jokeapp.controllers;

import org.bj.jokeapp.services.JokeService;
import org.bj.jokeapp.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @GetMapping
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.joke());
        return "chucknorris";
    }

}
