package Day_6;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
// Return true if a and b are alike. Otherwise, return false.
// Example 1:

import java.util.HashSet;

// Input: s = "book"
// Output: true
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
// Example 2:

// Input: s = "textbook"
// Output: false
// Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
// Notice that the vowel o is counted twice.
public class String_Halves_Are_Alike {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,(int)(s.length()/2));
        String b = s.substring((int)(s.length()/2),s.length());
        char[] vowels =  {'a','e','i','o','u','A','E','I','O','U'};
        int countA = countVowels(a, vowels);
        int countB = countVowels(b, vowels);
        return countA==countB;
    }
    private int countVowels(String str, char[] vowels) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (char vowel : vowels) {
                if (c == vowel) {
                    count++;
                    break;  // No need to check other vowels once a match is found
                }
            }
        }
        return count;
    }
}
