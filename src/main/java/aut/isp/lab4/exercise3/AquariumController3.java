package aut.isp.lab4.exercise3;
import aut.isp.lab4.exercise2.FishFeeder;

public class AquariumController3 {

    //attributs
    FishFeeder feeder= new FishFeeder("Adl", "232", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;

    //constructors
    public AquariumController3(String manufacturer, String model, float currentTime)
    {
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
        this.currentTime=currentTime;
    }
    //methods
    public float getFeedingTime(){
        return feedingTime;
    }
    public void setFeedingTime(float feedingTime)
    {
        this.feedingTime=feedingTime;
    }
    public String GetManuFa()
    {
        return this.manufacturer;
    }
    public String GetModel(){
        return this.model;
    }
    public float getCurrentTime(){
        return this.currentTime;
    }
    public void setCurrentTime(float currentTime)
    {
        this.currentTime=currentTime;
        if(feeder.GetMeals()==0)
            feeder.fillUP();
        if(getFeedingTime()==getCurrentTime())
            feeder.feed();
    }

    @Override
    public String toString()
    {
        return GetManuFa()+" "+GetModel()+" "+Float.toString(getCurrentTime())+" "+Float.toString(getFeedingTime());
    }
    public static void main(String[] args)
    {
        AquariumController3 a=new AquariumController3("ND Aquatics Ltd", "2AAA", 2f);
        a.setFeedingTime(2f);
        a.setCurrentTime(2f);
        System.out.println(a.toString());



    }
}
