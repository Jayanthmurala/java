package constructor;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Desial");
        Car car3 = new Car("bule","Desial",7);
        Car car4 = new Car("Eletric",5);
        car1.printt(); 
        car2.printt(); 
        car3.printt(); 
        car4.printt(); 
        
    }
    
}
