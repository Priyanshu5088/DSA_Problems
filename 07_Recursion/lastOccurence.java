public class lastOccurence {
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={5,6,2,3,8,4,5,9,1,0,4,9};
        System.out.println(lastOcc(arr,5,0));
    }
}
