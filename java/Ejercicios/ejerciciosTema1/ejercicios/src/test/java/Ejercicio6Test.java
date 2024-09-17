import org.example.tema1.Ejercicio6;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    @DisplayName("Test metodo concatenar")
    public void concatenarTest(){
        //arrange
        String expected = "HolaQueTal";
        //act
        String result = ejercicio6.concatenar(List.of("Hola", "Que", "Tal"));
        //assert
        assertEquals(expected, result);
    }
}
