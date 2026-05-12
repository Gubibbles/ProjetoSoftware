package com.example.demo.repository;

import com.example.demo.model.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoupaRepository extends JpaRepository<Roupa, Integer> {
    List<Roupa> findByNomeProduto(String nomeProduto);

    void deleteById(Long id);

    Roupa getReferenceById(Long id);
}
