import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calculator myCalc;

    @Before
    public void before(){
        myCalc = new Calculator();
    }

    @Test
    public void testCanAdd(){
        int result = myCalc.add(2, 4);
        assertEquals(6, result);
    }

    @Test
    public void testCanSubtract(){
        int result = myCalc.subtract(2, 4);
        assertEquals(-2, result);
    }

    @Test
    public void testCanMultiply(){
        int result = myCalc.multiply(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void testCanDivide(){
        double result = myCalc.divide(7, 3);
        assertEquals(2.33, result, 0.1);
    }
}
