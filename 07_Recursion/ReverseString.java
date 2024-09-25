import java.util.*;

public class ReverseString {
    public static String reverse(String S ,int idx){
        // Base Case
        if(idx == S.length()) return "";

        String smallString = reverse(S,idx+1);
        return smallString + S.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(reverse(S,0));

        // IF we want to check our reverse string is Palindrome or not
        // String rev = reverse(S, 0);
        // if(rev.equals(S)){
        //     System.out.printf("%S is Palindrome",S);
        // }else{
        //     System.out.printf("%S is not Palindrome",S);
        // }

    }
    
}
