package com.cinemafile.backend.repository;

import com.cinemafile.backend.model.MovieList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieListRepository extends JpaRepository<MovieList, Integer> {
} // end interface MovieListRepository

