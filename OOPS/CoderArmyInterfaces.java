public class CoderArmyInterfaces {
    public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}


interface Car {
    void start();

     void accelerate();
    
     void brake();
}

class FuelCar implements Car{
    public void start(){
        System.out.println("Fuelcar started");
    }
    public void accelerate(){
        System.out.println("FuelCar is accelerating");
    }
    public void brake(){
        System.out.println("FuelCar is stopping");
    }
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electriccar started");
    }
    public void accelerate(){
        System.out.println("ElectricCar is accelerating");
    }
    public void brake(){
        System.out.println("ElectricCar is stopping");
    }
}