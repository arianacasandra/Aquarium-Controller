package aut.isp.lab4.exercise5;

public class Heater extends Actuator {
    public Heater(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("The heater is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("The heater is turn off");
    }

}
