import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(51);
        list.add(8);
        list.add(7);

        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
           // maxValue = Math.max(maxValue,list.get(i));
           if(maxValue < list.get(i)){
            maxValue = list.get(i);
           }
 
        }
        System.out.println("Maximum value is -->" + maxValue);
    }
    
}
