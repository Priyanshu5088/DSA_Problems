public class MergeSort {
    public static void printArr(int arr[]){ //Function to print array
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){//Recursive Function
        if(si>=ei){//Base Case
            return ;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);//Left Part
        mergeSort(arr, mid+1, ei);//Right Part
        merge(arr, si, mid, ei);
    }
    //Merge method to merge the sorted array 
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int [ei-si+1];
        int i = si;//iterator(index) for left sorted part
        int j = mid+1;//iterator(index) for right part
        int k = 0;//iterator(index) for Temporary arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted arr
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover elements of 2nd sorted arr
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy elements of temporary arr in original arr
        for(k=0,  i=si ;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    } 

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
