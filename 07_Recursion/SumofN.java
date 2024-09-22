public class SumofN {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int SnM1 = sum(n-1);
        int Sn = n + SnM1;
        return Sn; 
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
