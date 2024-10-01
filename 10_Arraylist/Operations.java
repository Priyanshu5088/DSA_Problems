import java.util.ArrayList;

public class Operations{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();

        // Add Operation -- O(1)
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

        //Another add operation which can go to an index and add elements -- O(n)
        // list.add(3,10);
        // System.out.println(list);

        // Get elements -- O(1)
        int elements = list.get(1);
        System.out.println(elements);

        // Delete elements -- O(1)
        // list.remove(0);
        // System.out.println(list);

        //Set elements at Index -- O(n)
        list.set(4,12);
        System.out.println(list);

        // Contains elements
        System.out.println(list.contains(3));
        System.out.println(list.contains(12));

    }
    
}
