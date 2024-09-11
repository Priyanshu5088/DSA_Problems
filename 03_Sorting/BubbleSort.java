import java.util.*;

public class BubbleSort {

    public static void bubble(int arr[]){
    for(int turn = 0; turn<arr.length-1; turn++){
        for(int j = 0; j<arr.length-1-turn; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }    
        } 
    }
   
}   
    public static void printArr(int arr[]){
    for(int i=0 ; i<arr.length;i++){
        System.out.print(arr[i] + "  ");
    }
}


    public static void main(String[] args) {
        int arr[] = {5,6,1,8,4,3,9};
        bubble(arr);
        printArr(arr);
    }
}
