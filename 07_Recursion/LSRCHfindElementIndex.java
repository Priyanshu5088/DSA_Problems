import java.util.*;

public class LSRCHfindElementIndex {
    public static int find(int a[] ,int target, int idx){
        // BASE CASE
        if(idx >= a.length){
            return -1;
        }
        // Self Work
        if(a[idx] == target) return idx;

        // Recursive Work
        return find(a, target, idx+1);

    }

    public static void main(String[] args) {
        int a[] = {3,7,5,8,3};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(find(a, target, 0));
       
    }
    
}

    

