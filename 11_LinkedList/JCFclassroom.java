import java.util.LinkedList;

public class JCFclassroom {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        //0->1->2->3
       // System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        //1->2
        System.out.println(ll);
    }
    
}
