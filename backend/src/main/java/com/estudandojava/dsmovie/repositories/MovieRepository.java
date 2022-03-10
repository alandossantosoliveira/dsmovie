package com.estudandojava.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
