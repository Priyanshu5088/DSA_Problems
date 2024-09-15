public class countSETbit {
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count ++;
                  
          }
          n = n>>1;                         //question asked in amazon and google
          
        }
        return count;
    }
    

    public static void main(String[] args) {
        System.out.println(countSetBit(7));
    }
    
}
