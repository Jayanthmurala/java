package constructor;

/**
 * Car
 */
public class Car {

    public String color;
    public String Engine ;
    public int wheels;
    Car(){
        this.color="BLACK";
        this.Engine="petrol";
        this.wheels=4;
        
    }
    Car(String t){
        this.Engine=t;

    }
    Car(String c,String t,int w){
        this.color=c;
        this.Engine=t;
        this.wheels=w;
        
    }
    Car(String t,int w){
        this.Engine=t;
        this.wheels=w;


    }
    public void printt(){
        System.out.println(color+"\n"+Engine+"\n"+wheels);
    }



}