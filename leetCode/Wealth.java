// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.

public class Wealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        Wealth j = new Wealth();
        System.out.println(j.maximumWealth(accounts));
        
    }
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        for (int i = 0; i<accounts.length; i++) {
            int max=sum(accounts[i]);
            if(max>ans){
                ans=max;
            }
        }
        return ans;
        
    }
    private int sum(int[] is) {
        int sum=0;
       for(int i:is){
        sum+=i;
       }
       return sum;
    }


}
