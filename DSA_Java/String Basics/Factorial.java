public class Factorial {
    public int fact(int num){
        if(num==0){
            return 1;
        }
        return fact(num-1)*num;
    }
    public static void main(String[] args) {
        Factorial obj =new Factorial();
        int result= obj.fact(5);
        System.out.println(result);
    }
    
}