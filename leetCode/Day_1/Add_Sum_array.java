package Day_1;
/**
 * Add_Sum_array
 * Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
 */
public class Add_Sum_array {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        Add_Sum_array u = new Add_Sum_array();
        int[] result = u.runningSum(n);
            for (int num : result) {
                System.out.print(num + " ");}
    }

    public int[] runningSum(int[] nums) {
        int [] op = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            op[i]=sum;
        }
        return op;
    }
}