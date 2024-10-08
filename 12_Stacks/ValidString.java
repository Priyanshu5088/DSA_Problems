import java.util.*;

public class ValidString {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        //Ist step
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){// for opening brackets
                s.push(ch);
            }else{ // for closing brackets
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')
                 ||(s.peek() == '{' && ch == '}')
                 ||(s.peek() == '[' && ch == ']')){
                    s.pop();//pair exists hence pop the pair
                 }else{
                    return false;
                 }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    


    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isValid(str));
    }
}
