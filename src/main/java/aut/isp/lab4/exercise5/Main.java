package aut.isp.lab4.exercise5;
import aut.isp.lab4.exercise5.Sensor;
import aut.isp.lab4.exercise5.LevelSensor;




public class Main {

        public static void main(String[] args) {
            AquariumController5 a5=new AquariumController5("ND Aquatics Ltd", "2AAA", 2f);
            a5= new AquariumController5();

            ((TemperatureSensor) a5.getTemperatureSensor()).setValue(22);
            System.out.println(((TemperatureSensor) a5.getTemperatureSensor()).getValue());
            a5.checkTemperature();
            ((LevelSensor)a5.getLevelSensor()).setValue(101);
            System.out.println(((LevelSensor) a5.getLevelSensor()).getValue());
            a5.checkWaterLevel();




        }

}
