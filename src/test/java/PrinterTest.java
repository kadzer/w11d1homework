import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(200, 100);
    }

    @Test
    public void hasToner(){
        assertEquals(100, myPrinter.getTonerVolume());
    }

    @Test
    public void hasPaper(){
        assertEquals(200, myPrinter.getPaperCount());
    }

    @Test
    public void printingDecreasesPaper(){
        myPrinter.print(3,2);
        assertEquals(194, myPrinter.getPaperCount());
    }

    @Test
    public void cannotPrintWithoutPaper(){
        myPrinter.print(200, 2);
        assertEquals(200, myPrinter.getPaperCount());
    }

    @Test
    public void printingDecreasesToner(){
        myPrinter.print(3,2);
        assertEquals(94, myPrinter.getTonerVolume());
    }
}
