package com.cinemafile.backend.repository;

import com.cinemafile.backend.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
} // end interface MovieRepository

