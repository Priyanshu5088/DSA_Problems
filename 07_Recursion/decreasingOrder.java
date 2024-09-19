public class decreasingOrder {
    public static void DecOrder(int n){
        if(n==1){      // base case
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");   
        DecOrder(n-1);   //recursive call 
    }

    public static void main(String[] args) {
        int n = 5;
        DecOrder(n);
    }
}
