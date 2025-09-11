package level1;
import level1.modelEx2.Car;

public class Ex2Main {

    public static void main(String[] args) {

        Car gto = new Car(250);

        Car.brake();
        gto.accelerate();

    }
}
