import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        for (int i = 2; i <= num; i++) {
            int divisorCount = 0; 
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {  
                    divisorCount++;
                    break; 
                }
            }

            if (divisorCount == 0) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
