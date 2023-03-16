package com.example.exp.ejercicio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ServicioProcesador {

    private int contadorLineaValida = 0;
    private int contadorLineaInvalida = 0;
    private LectorArchivo lectorArchivo;
    private ProcesadorArchivo procesadorArchivo;


    public RespuestaArchivo procesar(Archivo archivo){
        List<Persona> listaPersona =  lectorArchivo.leer(archivo.getRuta());
        for (Persona persona: listaPersona) {
            boolean esValido = procesadorArchivo.enviarLinea(persona, tipoArchivo); // comunicacion con el otro servicio.
            if(esValido){
                contadorLineaInvalida++;
            }
            else{
                contadorLineaValida++;
            }
        }
        //1 leer el archivo dependiendo de la extension.
        //2 enviar cada linea (persona) del archivo al microservicio de validacion.
        //3 recibir la respuesta (boolean ) si es true = linea valida si es false linea invalida

        return new RespuestaArchivo(contadorLineaValida, contadorLineaInvalida);
    }
}
