package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise1.AquariumController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestAquariumController {
    @Test

    public void TestGetCurrentTime()
    {
        AquariumController a1= new AquariumController("ND Aquatics Ltd", "2AAA", 2);
        float expected = 5;
        a1.setCurrentTime(5);
        float actual=a1.getCurrentTime();
        assertEquals(expected,actual, 0.0f);


    }
    @Test
    public void TestToString()
    {
        AquariumController a1= new AquariumController("ND Aquatics Ltd", "2AAA", 2);
        String expected;
        expected="ND Aquatics Ltd null 2.0";
        assertEquals(expected,a1.toString());
    }
}
