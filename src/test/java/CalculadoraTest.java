import org.example.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculadoraTest {
    @Test
    public void isGreaterTestOk(){
        System.out.println("Test");
        Calculadora c = new Calculadora();
        assertTrue("Num 1 is greater than Num 2",
                c.isGreater(4,3));
    }
    @Test
    public void isGreaterTestFail(){
        System.out.println("Test");
        Calculadora c = new Calculadora();
        assertTrue("Num 1 is greater than Num 2",
                c.isGreater(3,3));
    }
}
