package Java;

public class reverse {

    public static void main(String[] args) {
        int a = 23597;
        while (a > 0) {
            int p = a % 10;
            System.out.print(p);
            a /= 10;
        }
        // for (; a>0;a/=10){
        // int p =a%10;
        // System.err.print(p);

        // }

    }
}