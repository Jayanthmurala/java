package Assm;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a num : ");
    int n = sc.nextInt();
    fibonacci(n);
    sc.close();
}
    static void fibonacci(int f){
        int pre=0;
        int next=1;
        System.out.print("Fibonacci series :"+" "+pre+" "+next);
        while (next<f) {
            int temp = pre+next;
            pre=next;
            next=temp;
            System.out.print(" "+next);
            
        }
    }
}