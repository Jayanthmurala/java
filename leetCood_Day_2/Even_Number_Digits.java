package leetCood_Day_2;

public class Even_Number_Digits {
    public int findNumbers(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result+=count(nums[i]);
            
        }
        return result;
      
    }
    
    private int count(int i) {
        int digits=0;
        int temp=i;
        while (temp>0) {
            temp=temp/10;
            digits+=1;  
        }
        if(digits%2==0){
            return 1;
        }
        return 0;  
    }
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        Even_Number_Digits n = new Even_Number_Digits();
        System.out.println(n.findNumbers(nums));
    }
}
