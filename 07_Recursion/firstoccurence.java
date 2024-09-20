public class firstoccurence {
    public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {4,3,6,5,2,7,8,7,5,8};
        System.out.println(firstOcc(arr, 0,8));
    }
}








