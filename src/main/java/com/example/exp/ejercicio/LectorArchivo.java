package com.example.exp.ejercicio;

import java.util.ArrayList;

public class LectorArchivo {


    public List<Persona> leer(String ruta) {
        List<Persona> personas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("ruta)");
            String line;
            while((line = br.readLine()) != null){
                //line = //5f10e9D33fC5f2b,	Sara,	Mcguire,	Female,	tsharpexample.net,	(971)643-6089x9160,	8/17/1921,	Editor, commissioning
               String[] lineas =  line.split(",");
               //[5f10e9D33fC5f2b] [Sara] [Mcguire] [Female] [	tsharpexample.net]
              //    0                1        2         3            4
                Persona persona = new Persona(lineas[1], lineas[2], lineas[3] )..;
                personas.add(persona);

            }
        } catch (Exception e){
            System.out.println(e);
        }
        return personas;
    }
}
