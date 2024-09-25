import java.util.*;

public class SumofAlternateIntegers {
    public static int alternate(int n){
        // BASE CASE
        if(n==0){
            return 0;
        }
        // SUB PROBLEM & SELF WORK
        if(n % 2 == 0){ // FOR EVEN CASE
           return alternate(n-1) - n;
        }
        else{  // FOR ODD CASE
           return alternate(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(alternate(n));
    }
    
}
