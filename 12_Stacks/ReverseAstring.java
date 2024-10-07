import java.util.*;

public class ReverseAstring{
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        //reversing String
        StringBuilder result = new StringBuilder();

        while(!s.isEmpty()){// Poping each character from Stack untill Stack becomes empty
            char curr = s.pop();
            result.append(curr);//append each char one by one in the result
        }

        return result.toString();
    }
    
    public static void main(String[] args) {
        String str = "helloWorld";
        System.out.println(reverseString(str));
    }
}
