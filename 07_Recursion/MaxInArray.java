import javax.print.attribute.standard.MediaName;

public class MaxInArray {
    public static int MaxInArray(int arr[] ,int idx){
        // BASE CASE
        if(idx == arr.length-1){
            return arr[idx];
        }
        // Recursive Work
        int smallAns = MaxInArray(arr, idx+1);
        // Self Work
        return Math.max(smallAns,arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = {579,6,7,80,10,};
        System.out.println(MaxInArray(arr, 0));
    }
    
}
