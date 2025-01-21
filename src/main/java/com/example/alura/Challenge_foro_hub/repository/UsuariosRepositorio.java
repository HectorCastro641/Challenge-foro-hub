package com.example.alura.Challenge_foro_hub.repository;


import com.example.alura.Challenge_foro_hub.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByLogin(String username);
}