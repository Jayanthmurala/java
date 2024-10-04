package interfaces;

public class Car  implements Engine,Media,Brake{

    @Override
    public void stop() {
       System.out.println("engine stoped");
    }

    @Override
    public void start() {
        System.out.println("engine started");
    }


    @Override
    public void acc() {
        System.out.println("engine accelarate");
    }

    @Override
    public void brake() {
        System.out.println("I am brake ");
    }
    
}
