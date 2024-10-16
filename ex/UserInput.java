package ex;
// import java.util.Arrays;
import java.util.Scanner;

/**
 * UserInput
 */
class UserInput extends Exception {
     UserInput(String mesg){
        super(mesg);
     }
}
/**
 * InnerUserInput
 */
class InnerUserInput {
    public static void AgeValidate(int age) throws UserInput{
        if(age<18){
            throw new UserInput("not Elagible to vote your below 18");
        }
        else{
            System.out.println("your Elagible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input=in.nextInt();
        try{
            AgeValidate(input);
        }
        catch(UserInput e){
            System.out.println("age: "+input+" "+"is not elagible to vote");
        }
        in.close();
    }
    
}