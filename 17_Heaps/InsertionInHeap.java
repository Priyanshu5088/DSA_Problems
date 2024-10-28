import java.util.*;

public class InsertionInHeap {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at the last index
            arr.add(data);

            int x = arr.size()-1; //child idx
            int par = (x-1)/2; //parent idx
            
            while(arr.get(x) < arr.get(par)){//worst case TC : O(log n)
                //swap
                int temp = arr.get(x);
                arr.set(x , arr.get(par)); //child ke idx pr parent ki value
                arr.set(par , temp); // parent ke idx pr child ki value
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }
    
}
