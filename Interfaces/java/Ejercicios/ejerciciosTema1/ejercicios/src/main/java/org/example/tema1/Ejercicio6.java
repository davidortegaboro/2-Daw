package org.example.tema1;

import java.util.List;

public class Ejercicio6 {

    //Dada una lista de cadenas, usa programación funcional para concatenar todas las cadenas en una sola.

    public String concatenar(List<String> cadenas){

        return cadenas.stream().reduce("", (a, b) -> a + b);
    }
}
