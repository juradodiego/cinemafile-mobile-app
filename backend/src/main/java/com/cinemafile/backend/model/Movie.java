package com.cinemafile.backend.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Data // Lombok
@Entity // JPA
@Table(name = "MOVIES") // JPA
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String title;
    private String description;
    private double rating;
    @Column(name = "POSTER_URL")
    private String posterURL;
    @ElementCollection(targetClass=String.class)
    private List<String> genre;
    @ElementCollection
    @CollectionTable(name="SERVICE_VALIDITY_MAPPING", joinColumns=@JoinColumn(name="MOVIE_ID"))
    @MapKeyColumn(name="SERVICES")
    @Column(name="VALIDITY")
    private Map<String, Boolean> streamingServices;

} // end class Movie
