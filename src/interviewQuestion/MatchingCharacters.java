package interviewQuestion;

import java.util.Map;
import java.util.Stack;

// Characters: <>, (), []
// Input: String
// output: ture ot false depending on whether or not the string has matching characters
public class MatchingCharacters {
    public static boolean matchingCharacters(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockSymbols = Map.of(')','(', ']','[','>', '<');

        for (int i = 0; i < s.length(); i++){
            char current = s.charAt(i);

            if (blockSymbols.containsValue(current)){
                stack.push(current);
                continue;
            }
            if (blockSymbols.containsKey(current) && (stack.isEmpty() || blockSymbols.get(current) != stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String t1 = "[]indnj[";
        String t2 = "(<[]>)";

        System.out.println(matchingCharacters(t1));
        System.out.println(matchingCharacters(t2));
    }
}
