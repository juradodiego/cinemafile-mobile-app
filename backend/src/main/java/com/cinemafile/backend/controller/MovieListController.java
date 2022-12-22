package com.cinemafile.backend.controller;

import com.cinemafile.backend.service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-list")
// localhost:8080/movieList/...
public class MovieListController {
    @Autowired
    private MovieListService movieListService;
} // end of class MovieListController
