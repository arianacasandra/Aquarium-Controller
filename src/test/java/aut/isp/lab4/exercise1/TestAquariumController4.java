package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise4.AquariumController4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAquariumController4 {
    @Test

    public void TestGetCurrentTime()
    {
        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 0.0f);
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
        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(2.0f,a1.getFeedingTime(),0.0f);
    }
    @Test
    public void TestCurrentFeeding()
    {

        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.setCurrentTime(2.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(a1.getFeedingTime(),a1.getCurrentTime(),0.0f);
    }
    @Test
    public void TestToString()
    {
        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 2);
        String expected;
        expected="ND Aquatics Ltd null 2.0 0.0";
        assertEquals(expected,a1.toString());
    }
    @Test
    public void TestLightOn()
    {
        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.SetlightsOnTime(2.0f);
        assertEquals(2.0f,a1.GetlightsOnTime(),0.0f);
    }
    @Test
    public void TestLightOff()
    {
        AquariumController4 a1= new AquariumController4("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.SetlightsOffTime(2.0f);
        assertEquals(2.0f,a1.GetlightsOffTime(),0.0f);
    }
    @Test
    public void TestLightOnOff()
    {
        float expectedOn=6,expectedOff=18;
        AquariumController4 a=new AquariumController4("ND Aquatics Ltd", "2AAA", 2f);
        for(float i=0; i<24; i++)
        {
            a.setCurrentTime(i);

        }

        assertEquals(expectedOn,a.GetlightsOnTime(),0.0f);
        assertEquals(expectedOff,a.GetlightsOffTime(),0.0f);
    }
}
