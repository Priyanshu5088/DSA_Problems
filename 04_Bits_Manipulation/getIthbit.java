import java.util.*;;

public class getIthbit {
public static int getithBIT(int n,int i){
    int bitMask = 1<<i;
    if((n&bitMask)==0){
        return 0;
    }else{
        return 1;
    }
    }

    public static void main(String[] args) {
        System.out.println(getithBIT(5,2));
        
    }
    
}
