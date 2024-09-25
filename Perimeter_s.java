package Assm;

import java.util.Scanner;

/**
 * Perimeter_s
 */
public class Perimeter_s {
static void perimeterOfCircle(int r){
    System.out.println(2*3.14*r);
}
static void PerimeterOfRectangle(int a ,int b){
    System.out.println(2*(a+b));
}
static void PerimeterOfEquilateralTriangle(int a){
    System.out.println(3*a);
}
static void PerimeterOfSqure(int a){
    System.out.println(4*a);
}
static void PerimeterOfRhombus(int a){
    System.out.println(4*a);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radies: ");
    perimeterOfCircle(sc.nextInt());
    sc.close();
}
}
