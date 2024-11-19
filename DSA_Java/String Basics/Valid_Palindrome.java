public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // or
    // public boolean isPalindrome(String s) {
    //     StringBuilder filtered = new StringBuilder();
    //     // Filter out non-alphanumeric characters and convert to lowercase
    //     for (char c : s.toCharArray()) {
    //         if (Character.isLetterOrDigit(c)) {
    //             filtered.append(Character.toLowerCase(c));
    //         }
    //     }
    //     // Check if the filtered string is a palindrome
    //     String filteredString = filtered.toString();
    //     return filteredString.equals(filtered.reverse().toString());
    // }
}
