import org.example.tema1.Ejercicio5;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    @DisplayName("contarMayoresTest")
    public void contarTest(){
        //Arrange
        long expected = 3;
        //Act
        long result = ejercicio5.contarMayores(List.of(1,2,3,4,5,6,7,8,9,10), 7);
        //Assert
        assertEquals(expected, result);
    }
}
