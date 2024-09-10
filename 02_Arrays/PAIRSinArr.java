public class PAIRSinArr {

    public static void Pairs(int arr[]){
        int TotalPairs = 0;
        for(int i=0; i<arr.length;i++){
            int Firstvalue = arr[i];
            for(int j=i+1; j<arr.length;j++){
                System.out.print("(" + Firstvalue + "," + arr[j] + ")");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+ TotalPairs);
        
    }

    public static void main(String[] args) {
        int arr[] = {2,4,4,8,1,9};
        Pairs(arr);
    }
    
}
