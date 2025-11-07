interface EngineStart{
    void startEngine();
    default void checkBattery(){
        System.out.println("This is a default method");
    }
    static void switchBattery(){
        System.out.println("This is a default method");
    }
}
class CarEngine implements EngineStart{
    public void startEngine(){
        System.out.println("The engine of car is started by Key");
    }
}
class ElectricBike implements EngineStart{
    public void startEngine(){
        System.out.println("The engine of car is started by App");
    }
}

class Inter{
    public static void main(String args[])
    {
        EngineStart es = new CarEngine();
        es.startEngine();
        es.checkBattery();
        EngineStart.switchBattery();
    }
}

