package Assm;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Teble Number : ");
        table(in.nextInt());
        in.close();
    }
    static void table(int t){
        for (int i=1 ;i<=10;i++){
            System.out.println(t+" * "+i+" = "+i*t);
        }
    }
}
