package aut.isp.lab4.exercise5;
import aut.isp.lab4.exercise2.FishFeeder;

public class AquariumController5 {

    //attributs

    private Sensor levelSensor;
    private Sensor temperatureSensor;
    private  Actuator alarm;
    private Actuator heater;
    FishFeeder feeder= new FishFeeder("Adl", "232", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private float lightsOnTime;
    private float lightsOffTime;
    private int temperature;


    //constructors
    public AquariumController5(String manufacturer, String model, float currentTime)
    {
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
        this.currentTime=currentTime;
    }
    public AquariumController5()
    {
        temperatureSensor = new TemperatureSensor("Temp", "sensor", 0);
        levelSensor = new LevelSensor("Apa", "sensor", 0 );
        alarm = new Alarm("alarming", "alarmer");
        heater = new Heater("heating", "heater");
    }
    //methods
    public int getTemperature()
    {
        return this.temperature;
    }
    public void setTemperature(int temperature)
    {
        this.temperature=temperature;
    }
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
    public String test;
    public void checkTemperature(){
        temperature = ((TemperatureSensor)temperatureSensor).getValue();
        if(temperature>=25 && temperature<=27)
             alarm.turnOff();
        else alarm.turnOn();


    }
    public void checkWaterLevel()
    {

        if(((LevelSensor)levelSensor).getValue()<50)
            alarm.turnOff();
        else alarm.turnOn();

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
    public LevelSensor getLevelSensor()
    {
        return (LevelSensor) levelSensor;
    }
    public TemperatureSensor getTemperatureSensor()
    {
        return (TemperatureSensor) temperatureSensor;
    }

    @Override
    public String toString()
    {
        return GetManuFa()+" "+GetModel()+" "+Float.toString(getCurrentTime())+" "+Float.toString(getFeedingTime());
    }
    public static void main(String[] args)
    {
        AquariumController5 a=new AquariumController5("ND Aquatics Ltd", "2AAA", 2f);
        a.setFeedingTime(2f);
        a.setCurrentTime(2f);
        for(float i=0; i<24; i++)
           a.setCurrentTime(i);



    }
}
