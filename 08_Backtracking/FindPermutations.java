public class FindPermutations{
    public static void permutations(String str, String ans){
        //BASE CASE
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //Recursive Work
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // we are going to delete our str
            // eg: "abcde" = "ab" + "de" = "abde"
            String NewStr = str.substring(0,i) + str.substring(i+1,str.length());
            permutations(NewStr, ans+curr);
        }
        
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");

    }
    
}
