package GeekforGeek;

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        // Using Scanner for input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Loop through all test cases
        while (t-- > 0) {
            // Read the two integers n and m
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            // Create an instance of Solution class and call the compareNM method
            Solution obj = new Solution();
            String res = obj.compareNM(n, m);
            
            // Print the result
            System.out.println(res);
        }
        sc.close(); // Close the scanner to avoid resource leak
    }
}

// User-defined Solution class to handle comparison logic
class Solution {
    public  String compareNM(int n, int m) {
        // Compare n and m and return the appropriate result
        
        if (n > m) {
            return "greater";
        } else if (n < m) {
            return "lesser";
        } else {
            return "equal";
        }
    }
}
