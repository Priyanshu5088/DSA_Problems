import java.util.*;

public class GCDnormalAprroach {
    public static int IGCD(int x ,int y){
        while((x%y)!=0){
            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(IGCD(x,y));
    }
    
}
