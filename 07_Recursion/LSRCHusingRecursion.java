import java.util.Scanner;

public class LSRCHusingRecursion {
    public static boolean search(int a[] ,int target, int idx){
        if(idx >= a.length){
            return false;
        }
        // Self Work
        if(a[idx] == target) return true;
        // Recursive Work
        if(search(a, target, idx+1)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int a[] = {3,7,5,8,3};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        if(search(a, target, 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
