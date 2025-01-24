package com.agustin.movies.repositories;

import com.agustin.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
