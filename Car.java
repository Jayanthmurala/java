// Outer interface Car
interface Car {

    // Nested interface Engine
    interface Engine {
        void start();
        void stop();
    }

    // Other methods related to Car
    void drive();
    void park();
}

// Class that implements the nested Engine interface
class ElectricEngine implements Car.Engine {

    @Override
    public void start() {
        System.out.println("Electric engine starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopping.");
    }
}

// Class that implements the Car interface
class Tesla implements Car {

    private Car.Engine engine;

    public Tesla(Car.Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving.");
        engine.start();
    }

    @Override
    public void park() {
        System.out.println("Tesla is parked.");
        engine.stop();
    }
}

 class Main {
    public static void main(String[] args) {
        Car.Engine electricEngine = new ElectricEngine();
        Car myTesla = new Tesla(electricEngine);

        myTesla.drive(); // Output: Tesla is driving. Electric engine starting.
        myTesla.park();  // Output: Tesla is parked. Electric engine stopping.
    }
}
