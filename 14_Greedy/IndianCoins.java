import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        //Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        
        //Arrays.sort(coins, Comparator.comparingDouble(o -> o[1]));// after that we have to start loop from i=0 to i<coins.length
        int count = 0;
        int amount = 240;

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = coins.length-1; i>=0; i--){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Min. coins = " + count);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    
}
