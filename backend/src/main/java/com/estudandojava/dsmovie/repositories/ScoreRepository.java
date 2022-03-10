package com.estudandojava.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.dsmovie.entities.Score;
import com.estudandojava.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
