import java.util.*;

public class MonotonicArrayList{
    public static boolean monotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1;i++){
            if(list.get(i) >= list.get(i+1)){// For monotonic increasing
                inc = false;
            }
            else if(list.get(i) <= list.get(i+1)){// For monotonic decreasing
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(1);
        
        System.out.println(monotonic(list));
    }
    
}
