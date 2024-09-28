package Java;

import java.util.Scanner;

/**
 * If_Else
 */
public class If_Else {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = num.nextInt();
        num.close();
        if(num1%2==0){
            System.out.println(num1 +"is even");
        }else{
            
            System.out.println(num1 +"is odd");
            

        }

    }
}
