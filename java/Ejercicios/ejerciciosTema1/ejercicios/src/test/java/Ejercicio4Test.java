import org.example.tema1.Ejercicio4;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    @DisplayName("Metodo max")
    public void topNumberTest(){

        //arrange
            Integer expected = 10;
        //act
            Integer result = ejercicio4.max(List.of(1,4,10));
        //assert
        assertEquals(expected, result);
    }
}
