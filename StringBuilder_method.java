package GeekforGeek;
import java.io.*;
// import java.util.*;

/**
 * StringBuilder_method
 */
public class StringBuilder_method {
     String revStr(String s) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder temp = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            temp.append(s.charAt(i));
        }
        return temp.toString(); // Convert StringBuilder back to String

                    // OOOOOOOOOOORRRRRRRRRRRRR//

        // return new StringBuilder(s).reverse().toString();
    } 
    public class GFG {
        public static void main(String args[]) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String s = read.readLine();
                StringBuilder_method ob = new StringBuilder_method();
    
                System.out.println(ob.revStr(s));
            }
        }
    }
}
