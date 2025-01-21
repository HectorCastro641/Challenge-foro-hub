package com.example.alura.Challenge_foro_hub.domain.validacion;


import com.example.alura.Challenge_foro_hub.domain.topico.DatosGeneralTopico;
import com.example.alura.Challenge_foro_hub.infra.errores.ValidacionException;
import com.example.alura.Challenge_foro_hub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidacionUnicoNombreDelTopico implements ValidadorNombre{

    @Autowired
    TopicoRepository repository;

    @Override
    public void validar(DatosGeneralTopico datosGeneralTopico) {
        if (repository.findByTitulo(datosGeneralTopico.titulo()).isPresent()){
            throw new ValidacionException("el topico ya existe");
        }
    }

}