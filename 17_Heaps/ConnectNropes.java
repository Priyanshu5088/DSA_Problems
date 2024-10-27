import java.util.*;

public class ConnectNropes {
    public static void main(String[] args) {
        int ropes[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){ // add every element of array in pq
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1){ // jb tk mera pq mein q element na ho
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2); // sum ko pq mein add krdo
        }

        System.out.println("Min. cost of connecting N ropes " + cost);
    }
    
}
