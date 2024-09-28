package Java;


public class Permutation {
    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        Permutation u = new Permutation();
        // Printing the array properly
        int[] result = u.permutation(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] permutation(int[] nums) {
        int[] num = new int[nums.length * 2];  // Double the size of the original array
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];                   // Copying the first half
            num[i + nums.length] = nums[i];     // Copying the second half
        }
        return num;
    }
}


