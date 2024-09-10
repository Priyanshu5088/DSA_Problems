public class PrintLargestANDSmallest {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;//-INFINITY
        int smallest = Integer.MAX_VALUE;//+INFINITY

        for(int i=0;i<=arr.length-1;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
               smallest=arr[i];
            }
        }
        System.out.println("The Smallest element is :"+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,3,5,0,100};
        int LARGEST = getLargest(arr);
        System.out.println("The Largest element is :"+ LARGEST);
    }
    
}
