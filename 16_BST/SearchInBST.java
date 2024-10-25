public class SearchInBST {
        static class Node{
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data = data;
            }
        }


        public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }
    
            if(root.data > val){
                //go left
                root.left = insert(root.left, val);
            }else{
                //go right
                root.right = insert(root.right, val);
            }
            
            return root;
        }


    public static boolean search(Node root, int key){
        if(root == null) return false;

        if(root.data == key) return true;

        if(root.data > key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    

    //Preorder Traversal
    public static void Inorder(Node root){
        if(root == null) return;

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }


    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
           }
    
           Inorder(root);
           insert(root, 3);

        if(search(root, 7)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
     } 
}
