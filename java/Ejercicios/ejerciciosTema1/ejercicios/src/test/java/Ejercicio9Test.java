import org.example.tema1.Ejercicio9;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio9Test {

    Ejercicio9 ejercicio9 = new Ejercicio9();

    @Test
    @DisplayName("Ejercicio9")
    public void firstGreaterThanTest(){
        //arrange
        Optional<Integer> expected = Optional.of(8);
        //act
        Optional<Integer> result = ejercicio9.firstGreaterThan(List.of(2,4,5,6,7,8,9,10),7);
        //assert
        assertEquals(expected, result);
    }
}
