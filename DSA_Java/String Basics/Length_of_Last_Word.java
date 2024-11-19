// https://leetcode.com/problems/length-of-last-word/description/

// Input: s = "Hello World"
// Output: 5

// import java.util.Arrays;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String N = s.trim();
        String[] g = N.split(" ");
        return g[g.length-1].length();
    }
    public static void main(String[] args) {
        Length_of_Last_Word obj = new Length_of_Last_Word();
        System.out.println(obj.lengthOfLastWord("Hello World"));
    }
}
