package com.cinemafile.backend.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    @Column(name = "MOVIE_LIST_IDS")
    @ElementCollection(targetClass=Long.class)
    private List<Long> movieListIds;

} // end class User

