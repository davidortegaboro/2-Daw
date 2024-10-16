package org.example.tema1;

import java.util.List;
import java.util.Optional;

public class Ejercicio9 {

    // Dada una lista de enteros, devuelve el primer número que sea mayor a un valor dado.

    public Optional<Integer> firstGreaterThan(List<Integer> integers, Integer value){

        return integers.stream().filter(n -> n > value).findFirst();
    }
}
