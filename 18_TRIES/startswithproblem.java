public class startswithproblem {
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


    public static boolean startswith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String word[] = {"apple", "app" , "mango" , "man" , "woman"}; 
        String prefix1 = "app";
        String prefix2 = "moon";
        for(int i=0; i<word.length; i++){
        insert(word[i]);
        }

        System.out.println(startswith(prefix1));
        System.out.println(startswith(prefix2));
    }
}
