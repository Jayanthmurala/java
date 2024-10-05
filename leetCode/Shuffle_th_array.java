// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]


public class Shuffle_th_array {
    public int[] shuffle(int[] nums, int n) {
        int[] result= new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];

        }
        return result;      
    }
    public static void main(String[] args) {
       int[] nums={2,5,1,3,4,7};
       int n=3;
       Shuffle_th_array ans =new Shuffle_th_array();
       int[] j=ans.shuffle(nums, n);
       for(int jj: j){
        System.out.print(jj);

       }
    }
    
    
}
