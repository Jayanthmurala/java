/*
 * Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 
 */
/**
 * Permutation
 */
public class Permutation {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        Permutation u = new Permutation();
        int[] result = u.permutation(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] permutation(int[] nums) {
        int[] n = new int[nums.length * 2];
        int j = nums.length * 2;
        for (int i = 0; i < j; i++) {
            if (i > nums.length-1) {
                n[i] = nums[i - nums.length];
            } else {
                n[i] = nums[i];
            }
        }
        return n;
    }
}
