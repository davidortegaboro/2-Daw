import org.example.tema1.Ejercicio1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    @DisplayName("Ejercicio1")
    public void testSum (){

        //arrange
        Integer expected = 38;
        //act
        Integer result = ejercicio1.sum();

        //assert
        assertEquals(expected, result);
    }

}
