package Assm;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year= in.nextInt();
        String j=(year%4==0 && 100!=0||year%400==0)?"leap Year":"not a leap year";
        // if(year%4==0 && 100!=0||year%400==0){
        //     System.out.println("leap Year");
        // }else{
        //     System.out.println("not a leap year");
        // }
        System.out.println(j);
        in.close();
    }
}
