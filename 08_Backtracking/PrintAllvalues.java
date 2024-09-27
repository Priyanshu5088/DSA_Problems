import java.util.function.DoubleToIntFunction;

public class PrintAllvalues{
    public static void print(int[] arr, int idx, int value){
        //base case
        if(idx==arr.length){
            printArr(arr);
            return;
        }
        //Recursive Work
        arr[idx] = value;
        print(arr, idx+1, value+1);
        arr[idx] = arr[idx] - 2; // BACKTRACKING
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        print(arr, 0, 1);
        printArr(arr);
    }
}
    

