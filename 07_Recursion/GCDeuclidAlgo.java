import java.util.*;

public class GCDeuclidAlgo {
    public static int GCD(int x ,int y){
        // BASE CASE
        if(y==0){
            return x;
        }
        return GCD(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(GCD(x, y));
    }
    
}
