public class CoderArmyAbstraction {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}


abstract class Car{
    void start(){
        System.out.println("Car Started");
    }

    abstract void accelerate();
    
    abstract void brake();
}

class FuelCar extends Car{
    void accelerate(){
        System.out.println("FuelCar is accelerating");
    }
    void brake(){
        System.out.println("FuelCar is stopping");
    }
}

class ElectricCar extends Car{
    void accelerate(){
        System.out.println("ElectricCar is accelerating");
    }
    void brake(){
        System.out.println("ElectricCar is stopping");
    }
}