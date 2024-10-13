import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4 , m = 6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0 , v = 0;
        int hp = 1 , vp = 1;
        int cost = 0;
        while(v < costVer.length && h < costHor.length){
            if(costHor[h] < costVer[v]){
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }else{
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
        }

        //if their are remaining cuts cost 
        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        while(h < costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        System.out.println("Min. cost to cut chocolate = " + cost);
    }
    
}
