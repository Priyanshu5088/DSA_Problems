import java.util.*;
import java.util.LinkedList;

public class LevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;//returns root node
        }

        public static void levelorder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node cuuNode = q.remove();
                if(cuuNode == null){
                    System.out.println();//print next line
                    if(q.isEmpty()){ 
                        break;
                    }else{
                       q.add(null); 
                    }
                }else{
                    System.out.print(cuuNode.data + " ");
                    if(cuuNode.left != null){
                        q.add(cuuNode.left);
                    }
                    if(cuuNode.right != null){
                        q.add(cuuNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        tree.levelorder(root);
    }
    
}
