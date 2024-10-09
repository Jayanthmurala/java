package leetCood_Day_2;
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        String s =Integer.toString(x);
        String letter ="";
        for (int i = s.length()-1; i >=0; i--) {
            letter+=s.charAt(i);  
        }
        return s.equals(letter);
    }
    public static void main(String[] args) {
        Palindrome_Number kk = new Palindrome_Number();
        System.out.println(kk.isPalindrome(121));
    }
}
