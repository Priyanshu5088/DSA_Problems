public class MaxSubarraySum {// BRUTE FORCE APPROACH

    public static void MAXsubarraySum(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            int start = i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                  currSum += arr[k];  
                }
                System.out.println(currSum);
                if(MaxSum<currSum){
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("Total Sum = "+ MaxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MAXsubarraySum(arr);
    }
    
}
