import java.util.*;

public class RemoveAllOccurencesInSTRINGS {
    public static String remove(String S , int idx){
        // BASE CASE
        if(idx >= S.length()){
            return " ";
        }
        // RECURSIVE WORK
        String smallAns = remove(S, idx+1);
        char curr = S.charAt(idx);
        if(curr!='a'){
           return curr + smallAns; // Self Work 
        }else{
            return smallAns;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.print(remove(S, 0));
   }
    
}
