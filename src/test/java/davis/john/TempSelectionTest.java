package davis.john;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/4/16.
 */
public class TempSelectionTest {

    @Test
    public void testTempSelection() throws Exception {
        TempSelection ts = new TempSelection(40);
        String waxColor = ts.tempSelection();
        assertEquals("temp is ", "Yellow", waxColor);
        System.out.println("this passed");

    }

    @Test
    public void testTempInput() throws Exception {
        TempSelection ti = new TempSelection(4);
        String userInput = ti.tempSelection();
        assertEquals("Testing if it will return a temp", "White" ,userInput);
        System.out.println("temp selection passed");
    }
}