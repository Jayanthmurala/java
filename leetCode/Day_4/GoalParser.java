package Day_4;
// https://leetcode.com/problems/goal-parser-interpretation/description/
// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

// Given the string command, return the Goal Parser's interpretation of command.

 

// Example 1:

// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".
// Example 2:

// Input: command = "G()()()()(al)"
// Output: "Gooooal"
// Example 3:

// Input: command = "(al)G(al)()()G"
// Output: "alGalooG"




public class GoalParser {
    public String interpret(String command) {
        StringBuffer in = new StringBuffer();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i)=='(') {
                if (command.charAt(i+1)==')') {
                    in.append("o");
                }else{
                    in.append("al");
                }
            }
            in.append(command.charAt(i));
        }
        return in.toString();
    }
    public static void main(String[] args) {
        String g = "G()(al)";
        GoalParser gg = new GoalParser();
        System.out.println(gg.interpret(g));
    }
}
