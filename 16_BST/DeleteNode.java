public class DeleteNode {
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



//inorder Traversal
public static void inorder(Node root){
    if(root == null) return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}

public static Node delete(Node root, int key){
    if(root.data < key){
        root.right = delete(root.right, key);
    }
    else if(root.data > key){
        root.left = delete(root.left, key);
    }
    else{
        //CASE -- 1
        if(root.left == null && root.right == null){
            return null;
        }

        //CASE -- 2
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }

        //CASE -- 3
        Node IS = inorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
    }

    return root;
}


//INORDER SUCCESSOR
public static Node inorderSuccessor(Node root){
    while(root.left != null){
        root = root.left;
    }

    return root;
}


public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root = null;

    for(int i=0; i<values.length; i++){
        root = insert(root, values[i]);
    }

       inorder(root);
       System.out.println();

       root = delete(root, 1);
       System.out.println();

       inorder(root);
} 
    
}
