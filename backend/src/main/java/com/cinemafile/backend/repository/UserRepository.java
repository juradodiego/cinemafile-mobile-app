package com.cinemafile.backend.repository;

import com.cinemafile.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
} // end interface UserRepository

