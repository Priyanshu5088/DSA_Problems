// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(29);
        list.add(82);
        list.add(02);
        list.add(60);
        list.add(37);

        //Ascending Order Sorting
        Collections.sort(list);
        System.out.println(list);

        //Descending Order Sorting
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
