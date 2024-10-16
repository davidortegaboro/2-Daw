package org.example.tema1;

import java.util.List;

public class Ejercicio4 {

    // Dada una lista de enteros, usa programación funcional para encontrar el número máximo.

    public Integer max(List<Integer> integers){

        return integers.stream().reduce(0, (a, b) -> (a > b) ? a : b);
    }
}
