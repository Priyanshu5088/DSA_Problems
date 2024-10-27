import java.util.Comparator;
import java.util.PriorityQueue;

public class basicPQ {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//Priority off elements gets reversed
    pq.add(3);
    pq.add(4);
    pq.add(1); //1 pehle print hoga kyunki ye chota hai isiliye priority high hai
    pq.add(6);

    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
        
    }
}

}
