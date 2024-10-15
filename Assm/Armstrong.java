package Assm;

import java.util.Scanner;

/**
 * Armstrong NUMBER FOR three digits
 */
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Start Num: ");
        int s = sc.nextInt();
        System.out.print("Enter the End Num: ");
        int e = sc.nextInt();
        armstrong(s, e);
        sc.close();

    }

    static void armstrong(int s, int e) {
        for(int i=s; i<=e;i++){
            int sum=0;
            int temp=i;
            int c=i;
            while (c>0) {
                sum+=(c%10)*(c%10)*(c%10);
                c/=10;
                }
                if (sum==temp){
                    System.out.print(" "+sum);
                }
        }

    }

    {
    }
}