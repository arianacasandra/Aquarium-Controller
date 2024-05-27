package aut.isp.lab4.exercise2;


public class FishFeeder {
    private String manufacturer;
    private String model;
    int meals;
    public FishFeeder(String manufacturer,String model,int meals)
    {
        this.manufacturer=manufacturer;
        this.model=model;
        this.meals=meals;
    }
    public void feed()
    {
        this.meals-=1;
        System.out.println("Another meal was eaten");
    }
    public  void fillUP(){
        this.meals=14;
        System.out.println("The fill up program started again");

    }
    public String GetModel(){
        return this.model;
    }
    public String GetManuFa(){
        return this.manufacturer;
    }

    public int GetMeals()
    {
        return this.meals;
    }
    @Override
    public String toString()
    {
        return  GetManuFa() + " " + GetModel() + " " +String.valueOf(GetMeals());
    }
    public static void main(String[] args) {

        FishFeeder fish1= new FishFeeder("ND Aquatics Ltd", "2AAA", 0);
        System.out.println(fish1.toString());
        fish1.fillUP();
        System.out.println(fish1.toString());
        fish1.feed();
        System.out.println(fish1.toString());




    }
}
