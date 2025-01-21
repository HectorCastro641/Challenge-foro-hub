package com.example.alura.Challenge_foro_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosGeneralTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        LocalDateTime fechaDeCreacion,
        @NotNull
        Estado estado,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}