package interfaces;

public class Main {
    public static void main(String[] args) {
        
        // Car car = new Car();
           
        //    car.acc();
        //    car.start();
        //    car.stop();
        //    car.brake();
        Nicecar car = new Nicecar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.upgradeEngine();
        car.start();
        
    }
}
