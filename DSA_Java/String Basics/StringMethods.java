// import java.util.Arrays;

public class StringMethods {

    // public static void main(String[] args) {
    //     String name ="string methods" ;
    //     String name1 ="String";
    //     System.out.println(name.length());
    //     System.out.println(name.toUpperCase());
    //     System.out.println(name.toLowerCase());
    //     System.out.println(name.charAt(5));
    //     System.out.println(name.substring(0, 3));
    //     System.out.println(name.strip());
    //     System.out.println(name.trim());
    //     System.out.println(name.equals(name1));
    //     System.out.println(name.replace("s","ss"));
    //     System.out.println(name.indent(5));
    // }
}
class StringbufferMethods {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        name.append("string methods");
        String name1="java";
        System.out.println(name.length());
        System.out.println(name.toString());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(0, 3));
        System.out.println(name.insert(0,"java"));
        System.out.println(name.reverse());
        System.out.println(name.equals(name1));
        System.out.println(name.delete(6,name.length()));
    }
    
}