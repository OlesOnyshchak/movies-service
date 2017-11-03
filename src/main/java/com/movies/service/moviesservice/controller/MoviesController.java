package com.movies.service.moviesservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MoviesController {
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index";
    }
}
