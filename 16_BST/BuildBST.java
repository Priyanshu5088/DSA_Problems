import javax.xml.transform.Source;

public class BuildBST {
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


    public static void Preorder(Node root){
        if(root == null) return;

        Preorder(root.left);
        System.out.print(root.data + " ");
        Preorder(root.right);
    }

    public static void main(String[] args) {
       int values[] = {5,1,3,4,2,7};
       Node root = null;

       for(int i=0; i<values.length; i++){
        root = insert(root, values[i]);
       }

       Preorder(root);
       insert(root, 3);
    }
    
}
