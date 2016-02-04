package davis.john;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jrdavis on 2/4/16.
 */
public class SnowSelectionTest{



    @Test
    public void testConditionSelection() throws Exception {
        SnowSelection x = new SnowSelection("crusty");
        String waxColor = x.conditionSelection().toString();
        assertEquals("Condition is ","STANDARD", waxColor);

    }


}