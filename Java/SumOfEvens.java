package Java;

/**
 *[2,34,5,66,78,99]
 * ans=3\\
 * SumOfEvens
 */
public class SumOfEvens {

    public static void main(String[] args) {
        int[] arr ={2,34,51,66,78,99,100};
        System.out.println(numOfEvens(arr));
    }
    static int numOfEvens(int[] arr){
        int count=0;
        for(int i:arr){
            if(i>9 && even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int element){
        return element%2==0;
    }    
}