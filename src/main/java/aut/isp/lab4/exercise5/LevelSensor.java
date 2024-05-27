package aut.isp.lab4.exercise5;
import aut.isp.lab4.exercise5.Sensor;



public class LevelSensor extends Sensor {
    private float value;
    public LevelSensor(String manufacturer, String model, float value){
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
