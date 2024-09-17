import org.example.tema1.Ejercicio7;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ejercicio7Test {

    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    @DisplayName("Test listaAlCuadrado")
    public void testListaAlCuadrado(){
        //Arrange
        List<Integer> expected = List.of(4, 9, 16);
        //act
        List<Integer> result = ejercicio7.listaAlCuadrado(List.of(2, 3, 4));
        //assert
        assertEquals(expected, result);
    }
}
