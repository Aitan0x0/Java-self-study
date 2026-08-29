package CarTask;

public class Car {
    private String brand = "";
    private int year = 0;
    private int speed = 0;
    private boolean isEngineRunning = false;

    //konstruktor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    //getter and setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEngineRunning(boolean isEngineRunning) {
        this.isEngineRunning = isEngineRunning;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    ///Muherriki ise salir
    public void startEngine() {
        if (isEngineRunning) {
            System.out.println("Muherrik islek veziyyetdedir");
        } else {
            System.out.println("Muherrik ise salindi");
            isEngineRunning = true;
        }
    }

    ///Muherriki sondurur
    public void stopEngine() {
        if (speed > 0) {
            System.out.println("Evvelce masini dayandirin. Suret: " + speed);
        } else if (!isEngineRunning) {
            System.out.println("Muherrik sonuludur");
        } else {
            isEngineRunning = false;
            System.out.println("Muherrik sonduruldu");
        }
    }

    ///Suret artirir
    public void accelerate(int increase){
        if(!isEngineRunning){
            System.out.println("Evvelce muherriki yandirin");
        }
        else{
            speed+=increase ;
            System.out.printf("Yeni suret:%d%n" , speed);
        }

    }


}

