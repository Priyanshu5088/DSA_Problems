public class nthFinbonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
               
        }
        int fnM1 = fib(n-1);
        int fn = n + fnM1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
