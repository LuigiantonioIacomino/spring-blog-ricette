package com.learning.blogricette.repository;

import com.learning.blogricette.model.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RicettaRepository extends JpaRepository<Ricetta,Integer> {
    Optional<Ricetta> findById(Integer id);
    Optional<Ricetta> findByNome(String nome);

    List<Ricetta> findByNomeContaining(String search);
}
