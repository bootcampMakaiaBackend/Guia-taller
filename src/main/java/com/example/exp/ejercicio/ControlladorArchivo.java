package com.example.exp.ejercicio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ControlladorArchivo {

    @PostMapping("/archivo/validar")
    public boolean procesar(@RequestBody Persona persona){
            servicioValidador.process(persona);
    }
}
