package aut.isp.lab4.exercise5;

public class Alarm extends Actuator{
    public Alarm(String manufacturer, String model) {
        super(manufacturer, model);
    }
        @Override
    public void turnOn() {
        System.out.println("The alarm is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("The alarm is turn off");
    }
}
