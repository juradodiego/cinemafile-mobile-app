package com.cinemafile.backend.service.impl;

import com.cinemafile.backend.repository.MovieRepository;
import com.cinemafile.backend.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

} // end of class MovieServiceImpl