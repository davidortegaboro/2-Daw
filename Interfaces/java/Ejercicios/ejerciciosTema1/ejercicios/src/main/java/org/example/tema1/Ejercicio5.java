package org.example.tema1;

import java.util.List;

public class Ejercicio5 {

    //Dada una lista de enteros y un valor, cuenta cuántos elementos son mayores a ese valor.

    public long contarMayores(List<Integer> integers, Integer value){

        return integers.stream().reduce(0, ( a, b) -> b > value ? a + 1 : a);
    }
}
