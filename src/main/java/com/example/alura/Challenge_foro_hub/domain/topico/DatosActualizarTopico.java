package com.example.alura.Challenge_foro_hub.domain.topico;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Estado estadoActualizado
) {
}