import java.util.*;
import java.util.LinkedList;

public class ImplementingUsingJCF {
    public static void main(String[] args) {
      //  Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(4);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
