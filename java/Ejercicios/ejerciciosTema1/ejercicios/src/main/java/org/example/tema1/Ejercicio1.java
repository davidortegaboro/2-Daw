package org.example.tema1;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

    public Integer sum(){
        // Dada una lista de enteros, usa programación funcional para calcular la suma de todos los elementos.

        List<Integer> integers = Arrays.asList(4,6,21,6);

        return integers.stream().reduce(1, (a, b)-> a + b);
    }
}
