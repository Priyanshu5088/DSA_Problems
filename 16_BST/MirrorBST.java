import javax.annotation.processing.SupportedOptions;

public class MirrorBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node mirror(Node root){
        if(root == null) return null;

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        //SWAP
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    //PREORDER TRAVERSAL
    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        
        mirror(root);
        preorder(root);
    }
}
