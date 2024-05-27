package aut.isp.lab4.exercise1;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;

    //constructors
    public AquariumController(String manufacturer, String model, float currentTime)
    {
        this.currentTime=currentTime;
        this.manufacturer=manufacturer;
        this.currentTime=currentTime;
    }
    //methods
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
    }

    @Override
    public String toString()
    {
        return GetManuFa()+" "+GetModel()+" "+Float.toString(getCurrentTime());
    }
    public static void main(String[] args)
    {
        AquariumController a=new AquariumController("ND Aquatics Ltd", "2AAA", 2);
        System.out.println(a.toString());



    }
}
