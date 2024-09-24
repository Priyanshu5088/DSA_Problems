public class PrintMultiples {
    public static void pm(int n ,int k){
        // BASE CASE
        if(k==1){
            System.out.println(n);
            return;
        }
        // RECURSIVE WORK --> SUB PROBLEM
         pm(n, k-1);

        // SELF WORK
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        pm(1, 5);
    }
    
}
