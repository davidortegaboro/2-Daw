package org.example.tema1;

import java.util.List;

public class Ejercicio8 {

    //Dada una lista de enteros, elimina los duplicados usando programación funcional.

    public List<Integer> removeDisticnts(List<Integer> integers){

        return integers.stream().distinct().toList();
    }
}
