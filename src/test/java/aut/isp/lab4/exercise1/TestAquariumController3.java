package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise3.AquariumController3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAquariumController3 {
    @Test

    public void TestGetCurrentTime()
    {
        AquariumController3 a1= new AquariumController3("ND Aquatics Ltd", "2AAA", 0.0f);
        float expected = 2.0f;
        a1.setCurrentTime(2.0f);
        float actual=a1.getCurrentTime();
        assertEquals(expected,actual, 0.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(a1.getFeedingTime(),a1.getCurrentTime(),0.0f);


    }
    @Test
    public void TestSetFeedingTime()
    {
            AquariumController3 a1= new AquariumController3("ND Aquatics Ltd", "2AAA", 0.0f);
            a1.setFeedingTime(2.0f);
            assertEquals(2.0f,a1.getFeedingTime(),0.0f);
    }
    @Test
    public void TestCurrentFeeding()
    {

        AquariumController3 a1= new AquariumController3("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.setCurrentTime(2.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(a1.getFeedingTime(),a1.getCurrentTime(),0.0f);
    }
    @Test
    public void TestToString()
    {
        AquariumController3 a1= new AquariumController3("ND Aquatics Ltd", "2AAA", 2);
        String expected;
        expected="ND Aquatics Ltd null 2.0 0.0";
        assertEquals(expected,a1.toString());
    }
}
