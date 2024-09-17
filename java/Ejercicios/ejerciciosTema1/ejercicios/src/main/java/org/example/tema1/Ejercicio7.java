package org.example.tema1;

import java.util.List;

public class Ejercicio7 {

    //Dada una lista de enteros, devuelve una lista con los cuadrados de cada número.

    public List<Integer> listaAlCuadrado(List<Integer> integers){

        return integers.stream().map(n -> n * n).toList();
    }
}
