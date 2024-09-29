public class SearchINrotatedSortedarr {
    public static int searchTar(int arr[],int tar,int si,int ei){
       //KAAM
        int mid = si+(ei-si)/2;
        //case found
        if(arr[mid]==tar){
            return mid;
       }
        
        //Mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si]<=tar && tar<=arr[mid]){
                return searchTar(arr, tar, si, mid-1);
            }
            //case b: right
            else{
                return searchTar(arr, tar, mid+1, ei);
            }
        }

        //Mid on L2
        else{
            //case c: right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return searchTar(arr, tar, mid+1, ei);
            }else{
                //case d: left
                return searchTar(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        int tarIdx = searchTar(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
