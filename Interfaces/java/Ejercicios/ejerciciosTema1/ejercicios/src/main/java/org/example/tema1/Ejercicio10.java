package org.example.tema1;

import java.util.List;

public class Ejercicio10 {

    //Dada una lista de cadenas, cuenta cuántas empiezan con una letra específica.

    public long countLetterSpecific(List<String> cadenas, Character c){
        return cadenas.stream().filter(str -> str.charAt(0) == c).count();
    }
}
