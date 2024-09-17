package org.example.tema1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {

    public List<String> allUpper (List<String> cadenas){

        //Dada una lista de cadenas, convierte todas a mayúsculas usando programación funcional

        return cadenas.stream().map(s -> s.toUpperCase()).toList();


    }
}
