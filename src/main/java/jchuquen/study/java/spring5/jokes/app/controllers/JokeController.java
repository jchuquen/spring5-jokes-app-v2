package jchuquen.study.java.spring5.jokes.app.controllers;

import jchuquen.study.java.spring5.jokes.app.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""}) // URL: / or blank
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
