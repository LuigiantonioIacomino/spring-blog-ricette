package com.learning.blogricette.repository;

import com.learning.blogricette.model.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ricettaRepository extends JpaRepository<Ricetta, Integer> {

}
