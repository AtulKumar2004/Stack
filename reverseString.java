import java.util.*;
public class reverseString {
    public static String reverseusingStack(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()) {
            char c = s.pop();
            res.append(c);
        }
        return res.toString(); 
    }

    public static void main(String[] args) {
        String str = "HelloAtul";
        String result = reverseusingStack(str);
        System.out.println(result);
    }
}