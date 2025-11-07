class Car{
    public void start(){
        System.out.println("Car starts");
    }
    public void accelerate(){
        System.out.println("Car is Accelerating");
    }
    public void changeGear(){
        System.out.println("Change the gear");
    }
}

class SmartCar extends Car{

    public void start(){
        System.out.println("SmartCar is starting");
    }
    public void accelerate(){
        System.out.println("SmartCar is Accelerating");
    }
    
    public void changeGear(){
        System.out.println("Change the gear");
    }
    public void smartControl(){
        System.out.println("SMart Car Control is present");
    }
}



class MyCarr{
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.start();
        car.changeGear();
        SmartCar car2 = new SmartCar();
        car2.accelerate();
        car2.start();
        car2.changeGear();
        // Car car3 = new SmartCar();
        // car3.accelerate();
        // car3.smartControl();

    }
}