package com.cinemafile.backend.controller;

import com.cinemafile.backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
// localhost:8080/movie/...
public class MovieController {
    @Autowired
    private MovieService movieService;
} // end of class MovieController
