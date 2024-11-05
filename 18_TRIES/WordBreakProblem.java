public class WordBreakProblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){ // Traversing each level
            int idx = word.charAt(level) - 'a'; // getting the idx of curr alphabet
            if(curr.children[idx] == null){ // Never exist 
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx]; // update the curr
        }

        curr.eow = true; // store true at the end of node
    } 


    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){ // Traversing each level
            int idx = key.charAt(level) - 'a'; // getting the idx of curr alphabet
            if(curr.children[idx] == null){ // Never exist 
                return false;
            }
            curr = curr.children[idx]; // update the curr
        }

        return curr.eow = true; // store true at the end of node
    }


    public static boolean wordbreak(String key){
        if(key.length() == 0) return true;

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i))  && 
               wordbreak(key.substring(i))){
                return true;
               }
        }

        return false;
    }

    public static void main(String[] args) {
        String word[] = {"i", "like" , "sam" , "samsung" , "mobile" , "ice"}; 
        for(int i=0; i<word.length; i++){
        insert(word[i]);
        }

        String key = "ilikesamsungice";
        System.out.println(wordbreak(key));
    }
}
