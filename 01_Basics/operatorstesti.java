import java.util.*;

public class operatorstesti {
    public static void main(String args[]){
        int x,y,z;
        x=y=z=2;
        x+= y;
        y-= z;
        z/= (x+y);//Here answer is 0.5, but output comes out to be 0
        System.out.println(x + "\n" + y + "\n" + z);
    }

    
}
