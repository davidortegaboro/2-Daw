package org.example.tema1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

        public List<Integer> numerosPares() {

            //Dada una lista de enteros, devuelve una lista con solo los números pares.

            List<Integer> integers = Arrays.asList(1,2,3,4);

            return integers.stream().filter(s -> s % 2 == 0).toList();
        }


}
