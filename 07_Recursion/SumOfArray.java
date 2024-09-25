public class SumOfArray {
    public static int SumOfArray(int arr[] ,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = SumOfArray(arr, idx+1);
        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        int arr[] = {579,6,7,80,10};
        System.out.println(SumOfArray(arr, 0));
    }
    
}
