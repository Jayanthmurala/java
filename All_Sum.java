package Assm;
import java.util.Scanner;
public class All_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean n = true;
        int count = 0;
        while (n) {
            String j = in.nextLine();
            if (j.equals("x")) {
                n = false;
            } else {
                count += sum(j);
            }
        }
        System.out.println(count);
        in.close();
    }

    static int sum(String k) {

        return Integer.parseInt(k);

    }
}
