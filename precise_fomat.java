package GeekforGeek;
// import java.io.*;
import java.util.*;

/**
 * precise_fomat
 */
public class precise_fomat {





    
     void printInFormat(float a, float b){
        float result = a/b;
        
        System.out.print( result+" ");
        System.out.printf("%5.3f\n", result);
        
        // Your code here to print upto 3 decimal places
        
    }    
    
}

//{ Driver Code Starts.

class GFG {
    public static void main (String[] args) {
        
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking testcases
        int testcases = sc.nextInt();
        
        while(testcases-- > 0){
            
            //taking 2 variables a,b
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            
            //creating an object of class Geeks
            precise_fomat g = new precise_fomat();
            
            //calling printInFormat() method
            //of class Geeks
            g.printInFormat(a, b);
            System.out.println();
            sc.close();
        
        }
        
    }
}

