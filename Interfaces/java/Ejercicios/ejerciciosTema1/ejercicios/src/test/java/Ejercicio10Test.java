import org.example.tema1.Ejercicio10;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio10Test {

    Ejercicio10 ejercicio10 = new Ejercicio10();

    @Test
    @DisplayName("Ejercicio10")
    public void ejercicio10Test(){
        //arrange
        long expected = 2;
        //act
        long result = ejercicio10.countLetterSpecific(List.of("aa", "eee", "ooo", "uuu", "albaricoque"), 'a');
        //assert
        assertEquals(expected, result);
    }
}
