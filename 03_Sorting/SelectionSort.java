import java.util.*;

public class SelectionSort {
    public static void selection(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minValue = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minValue] > arr[j]){
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArr(int arr[]){
        for(int k= 0;k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,4,1,3};
        selection(arr);
        printArr(arr);
    }

    
}
