public class FactofN {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnM1 = fact(n-1);
        int fn  = n*fnM1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    
}
