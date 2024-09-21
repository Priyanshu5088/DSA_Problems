public class PrintXNoptimized {
    public static int Optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = Optimizedpower(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        //n is odd
        if((n%2)!=0){
            halfPowerSq = x * halfPowerSq;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(Optimizedpower(2, 5));
    }
}
