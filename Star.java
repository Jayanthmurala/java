package Java;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.print("Enter Num: ");
        int numIn = num.nextInt();
        num.close();
        for (int i=numIn; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
