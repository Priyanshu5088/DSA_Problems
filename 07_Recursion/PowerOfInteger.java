public class PowerOfInteger {
    public static int pow(int p ,int q){
        // BASE CASE
        if(q == 0){
            return 1;
        }
        // SUB PROBLEM
        int smallAns = pow(p,q-1);

        // SELF WORK
        return smallAns * p;

        //  ----- OR -----
        // return pow(p,q) * p;
    }

    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
    
}
