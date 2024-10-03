import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.size());

        // If we want to traverse the ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    
}
