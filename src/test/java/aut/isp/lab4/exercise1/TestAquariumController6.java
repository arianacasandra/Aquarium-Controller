package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise6.AquariumController6;
import aut.isp.lab4.exercise6.PhSensor;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestAquariumController6 {
    @Test

    public void TestGetCurrentTime()
    {
        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 0.0f);
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
        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(2.0f,a1.getFeedingTime(),0.0f);
    }
    @Test
    public void TestCurrentFeeding()
    {

        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.setCurrentTime(2.0f);
        a1.setFeedingTime(2.0f);
        assertEquals(a1.getFeedingTime(),a1.getCurrentTime(),0.0f);
    }
    @Test
    public void TestToString()
    {
        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 2);
        String expected;
        expected="ND Aquatics Ltd null 2.0 0.0";
        assertEquals(expected,a1.toString());
    }
    @Test
    public void TestLightOn()
    {
        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.SetlightsOnTime(2.0f);
        assertEquals(2.0f,a1.GetlightsOnTime(),0.0f);
    }
    @Test
    public void TestLightOff()
    {
        AquariumController6 a1= new AquariumController6("ND Aquatics Ltd", "2AAA", 0.0f);
        a1.SetlightsOffTime(2.0f);
        assertEquals(2.0f,a1.GetlightsOffTime(),0.0f);
    }
    @Test
    public void TestLightOnOff()
    {
        float expectedOn=6,expectedOff=18;
        AquariumController6 a=new AquariumController6("ND Aquatics Ltd", "2AAA", 2f);
        for(float i=0; i<24; i++)
        {
            a.setCurrentTime(i);

        }

        assertEquals(expectedOn,a.GetlightsOnTime(),0.0f);
        assertEquals(expectedOff,a.GetlightsOffTime(),0.0f);
    }
    @Test
    public void TestSetGetPh()
    {
        AquariumController6 a=new AquariumController6("ND Aquatics Ltd", "2AAA", 2f);
        a= new AquariumController6();
        a.getPhSensor();
        a.SetPH(7);
        ((PhSensor)a.getPhSensor()).setValue(26);
        a.checkPH();
        float actual = ((PhSensor)a.getPhSensor()).getValue();
        assertEquals(26,actual, 0.0f );


    }

}
