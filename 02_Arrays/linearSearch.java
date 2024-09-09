import java.util.*;

public class linearSearch {
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,7,2,9,1,6,0};
        int key = 8;
        int index = LinearSearch(arr, key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("key found at index : " + index);
        }
        
    }
    
}
