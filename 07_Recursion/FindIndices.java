public class FindIndices {
    public static void find(int arr[] ,int target ,int idx){
        // BASE CASE
        if(idx >= arr.length) return;

        // SELF WORK
        if(arr[idx] == target){
            System.out.print(idx + " ");
        }
        
        // RECURSIVE WORK
        find(arr, target, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,5};
        //int target = 2;
        find(arr, 2, 0);
    }
    
}
