public class Searching {
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

    public static void main(String[] args) {
        String word[] = {"the", "a" , "there" , "their" , "any" , "thee"}; 
        for(int i=0; i<word.length; i++){
        insert(word[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
    
}
