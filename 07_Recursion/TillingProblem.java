public class TillingProblem {
    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical
        int tnM1 = tilling(n-1);

        //horizontal
        int tnM2 = tilling(n-2);

        int totalWays = tnM1 + tnM2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilling(2));
    }
}
