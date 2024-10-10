package Java;

/**
 * Try
 */
public class Try {
    private Try(){

    }
    private static Try inc;
    public static Try getinc(){
        if(inc==null){
            inc = new Try();
        }
        return inc;

    }

}