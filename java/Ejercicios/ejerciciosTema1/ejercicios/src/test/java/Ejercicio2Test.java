import org.example.tema1.Ejercicio2;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    @DisplayName("Test numeros pares")
    public void paresTest(){

        //arrange
        List<Integer> expected = Arrays.asList(2, 4);
        //act
        List<Integer> actual = ejercicio2.numerosPares();
        //Assert
        assertEquals(expected, actual);
    }
}
