import java.util.*;

public class PairSum2{
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int breakpoint = -1;
        int n = list.size();
        for(int i=0; i<n; i++){
                if(list.get(i)>list.get(i+1)){
                    breakpoint = i;
                    break;
            }
        }
        int lp = breakpoint + 1;
        int rp = breakpoint;
        while(lp!=rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }
            else if(list.get(lp) + list.get(rp) > target){
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 161));
    }
    
}
