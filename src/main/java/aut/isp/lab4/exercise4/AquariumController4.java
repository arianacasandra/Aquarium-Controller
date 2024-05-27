package aut.isp.lab4.exercise4;
import aut.isp.lab4.exercise2.FishFeeder;

public class AquariumController4 {

    //attributs
    FishFeeder feeder= new FishFeeder("Adl", "232", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private float lightsOnTime;
    private float lightsOffTime;

    //constructors
    public AquariumController4(String manufacturer, String model, float currentTime)
    {
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
        this.currentTime=currentTime;
    }
    //methods
    public float GetlightsOnTime()
    {
        return this.lightsOnTime;
    }
    public void SetlightsOnTime(float lightsOnTime)
    {
        this.lightsOnTime=lightsOnTime;
    }
    public float GetlightsOffTime()
    {
        return this.lightsOffTime;
    }
    public void SetlightsOffTime(float lightsOffTime)
    {
        this.lightsOffTime=lightsOffTime;
    }
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
        if(GetlightsOnTime()<6)
        {

            SetlightsOnTime(GetlightsOnTime()+1);
            System.out.println("The light is on " + GetlightsOnTime()+"h");


        }
        else if(GetlightsOffTime()<18 && GetlightsOnTime()>=6)
        {

            SetlightsOffTime(GetlightsOffTime()+1);
            System.out.println("The light is off "+ GetlightsOffTime()+"h" );

        }else if(GetlightsOnTime()>=6 && GetlightsOffTime()>=18)
        {
           SetlightsOffTime(0);
           SetlightsOnTime(0);
        }
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
        AquariumController4 a=new AquariumController4("ND Aquatics Ltd", "2AAA", 2f);
        a.setFeedingTime(2f);
        a.setCurrentTime(2f);
        for(float i=0; i<24; i++)
           a.setCurrentTime(i);



    }
}
