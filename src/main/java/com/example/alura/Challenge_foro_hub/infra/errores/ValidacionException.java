package com.example.alura.Challenge_foro_hub.infra.errores;

public class ValidacionException extends RuntimeException {
    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}