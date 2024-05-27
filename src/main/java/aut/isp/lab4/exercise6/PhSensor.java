package aut.isp.lab4.exercise6;
import aut.isp.lab4.exercise5.Sensor;


public class PhSensor extends Sensor {
    private float value;
    public PhSensor(String manufacturer, String model, float value){
        super(manufacturer,model);
        this.value=value;


    }
    public float getValue(){
        return this.value;
    }
    public void setValue(float value)
    {
        this.value=value;
    }
}
