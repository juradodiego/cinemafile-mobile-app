package com.cinemafile.backend.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "MOVIE_LISTS")
public class MovieList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(name = "USER_ID")
    private Long userId;
    private String name;
    @Column(name = "MOVIE_IDS")
    @ElementCollection(targetClass=Long.class)
    private List<Long> movieIds;

} // end class MovieList
