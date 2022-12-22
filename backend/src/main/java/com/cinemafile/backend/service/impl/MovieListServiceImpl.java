package com.cinemafile.backend.service.impl;

import com.cinemafile.backend.repository.MovieListRepository;
import com.cinemafile.backend.service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieListServiceImpl implements MovieListService {
    @Autowired
    private MovieListRepository movieListRepository;

} // end of class MovieListServiceImpl