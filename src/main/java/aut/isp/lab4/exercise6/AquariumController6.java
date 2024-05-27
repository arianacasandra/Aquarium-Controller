package aut.isp.lab4.exercise6;

import aut.isp.lab4.exercise2.FishFeeder;
import aut.isp.lab4.exercise5.*;

public class AquariumController6 {
    private  Sensor levelSensor;
    private  Sensor phSensor;
    private Sensor temperatureSensor;
    private  Actuator alarm;
    private  Actuator heater;
    FishFeeder feeder= new FishFeeder("Adl", "232", 14);
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private float lightsOnTime;
    private float lightsOffTime;
    private int temperature;
    private float ph;


    //constructors
    public AquariumController6(String manufacturer, String model, float currentTime)
    {
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
        this.currentTime=currentTime;
    }
    public AquariumController6()
    {
        temperatureSensor = new TemperatureSensor("Temp", "sensor", 0);
        levelSensor = new LevelSensor("Apa", "sensor", 0 );
        alarm = new Alarm("alarming", "alarmer");
        heater = new Heater("heating", "heater");
        phSensor = new PhSensor("phing", "pher", 0);
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
    public float GetPH()
    {
        return this.ph;
    }
    public void SetPH(float ph)
    {
        this.ph=ph;
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

    public void checkPH(){
       ph = ((PhSensor)phSensor).getValue();
        if(ph>=6.8 && ph<=7.8)
            alarm.turnOff();
        else alarm.turnOn();


    }
    public void checkTemperature(){
        temperature = ((TemperatureSensor)temperatureSensor).getValue();
        if(temperature>=25 || temperature<=27)
            alarm.turnOff();
        else alarm.turnOn();


    }
    public void checkWaterLevel()
    {

        if(((LevelSensor)levelSensor).getValue()<50)
            alarm.turnOff();
        else alarm.turnOn();

    }
    public LevelSensor getLevelSensor()
    {
        return (LevelSensor) levelSensor;
    }
    public TemperatureSensor getTemperatureSensor()
    {
        return (TemperatureSensor) temperatureSensor;
    }
    public PhSensor getPhSensor()
    {
        return (PhSensor) phSensor;
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
        AquariumController6 a=new AquariumController6("ND Aquatics Ltd", "2AAA", 2f);
        a= new AquariumController6();
        a.SetPH(7);
        ((PhSensor)a.getPhSensor()).setValue(26);
        a.checkPH();





    }
}
