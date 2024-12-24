package Assm;
import java.util.Scanner;
public class Area_s {
    // functions
    static void areaOfCircle(int r){
        System.out.println(3.14*r*r);
        
    }
    static void areaOfTriangle(int h , int b){
        System.out.println((h*b)/2);
    }
    static void areaOfRectangle(int l,int w){
        System.out.println(l*w);
    }
    static void areaOfParallelogram(int b,int h){
        System.out.println(b*h);
    }
    static void areaOfRhombus(int b ,int h){
        System.out.println(b*h);
    }
    static void areaOfEquilateral_Triangle(int a){
        System.out.println((Math.sqrt(3)/4)*a*a);
    }
    
    // main call
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        // circle
        System.out.print("enter a radies: ");
        areaOfCircle(sc.nextInt());
        // triangle
        System.out.print("enter a hight and base: ");
        areaOfTriangle(sc.nextInt(), sc.nextInt());
        // rectangle
        System.out.print("enter a length and width: ");
        areaOfRectangle(sc.nextInt(), sc.nextInt());
        // parallelogram
        System.out.print("enter a Base and higth : ");
        areaOfParallelogram(sc.nextInt(), sc.nextInt());
        // rhombus
        System.out.print("enter a Base and higth : ");
        areaOfRhombus(sc.nextInt(), sc.nextInt());
        // Equilateral
        System.out.print("enter a : ");
        areaOfEquilateral_Triangle(sc.nextInt());
        sc.close();
    }
}
