package aut.isp.lab4.exercise5;

 public abstract class Actuator {
    private String manufacturer;
    private String model;
    public String GetManuFa()
    {
        return this.manufacturer;
    }
    public String GetModel(){
        return this.model;
    }
    public abstract void turnOn();
    public  abstract void turnOff();

    public Actuator(String manufacturer,String model)
    {
        this.manufacturer=manufacturer;
        this.model=model;
    }
    @Override
    public String toString()
    {
        return GetManuFa()+" "+GetModel();
    }
}
