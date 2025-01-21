package com.example.alura.Challenge_foro_hub.repository;

import com.example.alura.Challenge_foro_hub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Optional<Topico> findByTitulo(String Titulo);
}