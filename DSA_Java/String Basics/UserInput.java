public class UserInput {
    public static boolean string(int s){
        String s1 =""+s;
        StringBuffer N = new StringBuffer();
        N.append(s);
        return N.reverse().toString().equals(s1);
    }
    public static void main(String[] args) {
        System.out.println(string(221));
    }
}
