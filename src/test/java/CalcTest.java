import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testCanAdd(){
        int sum = Calculator.add(2, 4);
        assertEquals(6, sum);
    }

    @Test
    public void testCanSubtract(){
        int sum = Calculator.subtract(2, 4);
        assertEquals(-2, sum);
    }

    @Test
    public void testCanMultiply(){
        int sum = Calculator.multiply(2, 4);
        assertEquals(8, sum);
    }

    @Test
    public void testCanDivide(){
        int sum = Calculator.divide(4, 2);
        assertEquals(2, sum);
    }
}
