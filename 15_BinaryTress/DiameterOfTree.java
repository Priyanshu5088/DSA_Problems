public class DiameterOfTree {
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }


    // public static int diameter2(Node root){
    //     if(root == null) return 0;

    //     int ld = diameter2(root.left);
    //     int rd = diameter2(root.right);
    //     int lh = height(root.left);
    //     int rh = height(root.right);

    //     int selfDia = lh + rh + 1;

    //    return Math.max(selfDia , Math.max(ld, rd));
    // }


    //Approach II
    static class Info{
        int diam;
        int ht;

        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null) return new Info(0,0);

        Info lInfo = diameter(root.left);
        Info rInfo = diameter(root.right);

        int diam = Math.max(Math.max(lInfo.diam, rInfo.diam) , lInfo.ht + rInfo.ht + 1);
        int ht = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(diam, ht);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Diameter of the tree = " + diameter(root).diam);
    }
}
