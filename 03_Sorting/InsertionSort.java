public class InsertionSort {
    // in insertion sort we compare elements backward
    // we take Ist element as sorted and compare it with the next element 
    public static void insertion(int arr[]){
        for(int i = 1; i<arr.length; i++ ){
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,9,6,4};
        insertion(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
    }
    
}
