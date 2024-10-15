package Assm;

import java.util.Scanner;

/**
 * String_Palindrome
 */
public class String_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (palindrome(sc.nextLine())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }

    static Boolean palindrome(String check) {
        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
