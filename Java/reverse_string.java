// https://leetcode.com/problems/reverse-string/description/
// reverse-string

public class reverse_string {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            // Swap the characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }
    }
}