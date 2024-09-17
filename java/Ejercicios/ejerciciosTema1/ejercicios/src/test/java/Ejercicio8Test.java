import org.example.tema1.Ejercicio8;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio8Test {

    Ejercicio8 ejercicio8 = new Ejercicio8();

    @Test
    @DisplayName("Remove Distincts")
    public void distinctsTest(){

    //arrange
        List<Integer> expected = List.of(2,4,6,8);
    //act
        List<Integer> result = ejercicio8.removeDisticnts(List.of(2,2,4,4,6,6,8,8));
    //assert
        assertEquals(expected, result);
    }
}
