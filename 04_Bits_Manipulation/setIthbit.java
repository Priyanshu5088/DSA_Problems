import java.util.*;

public class setIthbit {
    public static int setIthBIT(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;

    }


    public static void main(String[] args) {
        System.out.println(setIthBIT(10, 2));
    }
    
}
