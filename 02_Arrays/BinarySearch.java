public class BinarySearch {

    public static int BS(int arr[],int key){// ARRAY SHOULD BE SORTED
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={15,25,35,45,55,65,75,79};
        int index = BS(arr,45);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index:"+index);
        }
    }
}
