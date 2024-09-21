public class singleORpair {
    public static int SingleOrPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //choices
        //single
        int fnM1 = SingleOrPair(n-1);
        //pair
        int fnM2 = SingleOrPair(n-2);
        int pairWays = n * fnM2;
        
        int totalWays = fnM1 + pairWays;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(SingleOrPair(3));
    }
}
