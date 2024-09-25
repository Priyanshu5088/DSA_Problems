public class SumOfSubsets {
    public static void sumSubset(int arr[] ,int idx ,int sum){
        if(idx >= arr.length){
            System.out.println(sum);
            return;
        }

        sumSubset(arr, idx+1, sum);
        sumSubset(arr, idx+1, sum + arr[idx]);
    }
     public static void main(String[] args) {
        int arr[] = {2,4,5};
        sumSubset(arr, 0, 0);
     }
}
