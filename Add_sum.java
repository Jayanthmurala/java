package Java;
public  class Add_sum {
    public static void main(String[] args) {
        
    
    int[] n = {1,2,3};
    Add_sum u = new Add_sum();
    int[] result = u.runningsum(n);
        for (int num : result) {
            System.out.print(num + " ");}}

    public int[] runningsum(int[] nums) {
        int[] n = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            n[i]=nums[i];
                       

        }
        return n;
        
    }}

