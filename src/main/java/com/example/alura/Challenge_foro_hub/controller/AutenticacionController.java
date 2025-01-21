package com.example.alura.Challenge_foro_hub.controller;

import com.example.alura.Challenge_foro_hub.domain.usuario.DatosAutenticacionUsuario;
import com.example.alura.Challenge_foro_hub.domain.usuario.Usuario;
import com.example.alura.Challenge_foro_hub.infra.seguridad.Token;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Token token;


    @PostMapping
    public ResponseEntity<String> autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(
                datosAutenticacionUsuario.login(),
                datosAutenticacionUsuario.clave()
        );
        var usuaroAutenticado = authenticationManager.authenticate(authToken);
        var jwtToken = token.obtenerToken((Usuario) usuaroAutenticado.getPrincipal()); // Pasa el objeto Authentication
        return ResponseEntity.ok(jwtToken);
    }
}