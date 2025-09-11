package level1.modelEx2;

import java.util.Scanner;

public class Car {

    private static final String trademark = "FERRARI";
    private static String model;
    private final int power;

    public Car(int power) {
        this.power = power;
        setModelName();
    }

    public void setModelName(){
        System.out.println("Enter the name of the model");
        Scanner sc = new Scanner(System.in);
        model=sc.nextLine();
    }

    public static void brake(){
        System.out.println("The car is braking");
    }

    public void accelerate(){
        System.out.println(trademark + " " + model + " is accelerating");

    }
}
