package Java;

/**
 * SolutionInput: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {12,444};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count=0;
        for(int element:nums){
            if(even(element)){
                count++;
            }
        }
        return count;
        
    }

    static boolean even(int element) {
        int count=0;
        while (element>0) {
            count++;
            element/=10;
        }
        return count%2==0;

    }
        
}