package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.FishFeeder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFishFeeder {
 @Test
    public void TesttoString()
   {
       FishFeeder fish1= new FishFeeder("ND Aquatics Ltd", "2AAA", 0);
       fish1.fillUP();
       String expected="ND Aquatics Ltd 2AAA 14";
       assertEquals(expected,fish1.toString());
   }
   @Test
    public void TestFillUp()
   {
       int expected=14;
       FishFeeder fish1= new FishFeeder("ND Aquatics Ltd", "2AAA", 0);
       fish1.fillUP();
       assertEquals(expected,fish1.GetMeals());
   }
   @Test
    public void TestFeed()
   {
       int expected=12;
       FishFeeder fish1= new FishFeeder("ND Aquatics Ltd", "2AAA", 0);
       fish1.fillUP();
       fish1.feed();
       fish1.feed();
       assertEquals(expected, fish1.GetMeals());
   }

}
