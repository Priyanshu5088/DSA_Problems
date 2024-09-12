/* Q:-  Given an integer array arr , move all 0's to the end of it while maintaining the relative order of the non-zero element.
        
        Note that you must do this in-place without making a copy of the array.
        
        INPUT:
        0,4,0,1,0,6
        
        OUTPUT:
        4,1,6,0,0,0
        */ 


public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,4,0,1,0,6};
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0 ; j<arr.length-1-i; j++){
                while(arr[j] == 0 && arr[j+1]!= 0){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i= 0; i<arr.length ; i++){
            System.out.print(arr[i] + "");
        }
    }

    
}
