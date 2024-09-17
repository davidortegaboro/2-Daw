import org.example.tema1.Ejercicio3;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    @DisplayName("Metodo UpperCase")
    public void upperTest(){

        //arrange
        List<String> expected = List.of("HOLA", "RICHI");
        //act
        List<String> actual = ejercicio3.allUpper(List.of("hola", "richi"));
        //assert
        assertEquals(expected, actual);
    }
}
