package Day_4;
// https://leetcode.com/problems/defanging-an-ip-address/description/
// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

 

// Example 1:

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"

public class Ip_Address {
    public String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if((""+address.charAt(i)).equals(".")){
                
                ip.append("[.]");
            }else{
                
                ip.append(address.charAt(i));
            }
        }
        return ip.toString();
    }
    public static void main(String[] args) {
        Ip_Address n = new Ip_Address();
        System.out.println(n.defangIPaddr("1.1.1.1"));
    }
}
