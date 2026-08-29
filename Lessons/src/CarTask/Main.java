package CarTask;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 2017);
//     System.out.println( car1.getSpeed());
        car1.startEngine();
        car1.accelerate(60);
        car1.startEngine();
    }
}
