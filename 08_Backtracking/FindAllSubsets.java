public class FindAllSubsets {
    public static void Subsets(String str, String ans, int i){
        // BASE CASE
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // Choices:-
        // FOR YES
        Subsets(str, ans+str.charAt(i), i+1);

        // FOR NO
        Subsets(str, ans, i+1);  
      }

      public static void main(String[] args) {
        String str = "abc";
        Subsets(str, "", 0);
      }
    
}
