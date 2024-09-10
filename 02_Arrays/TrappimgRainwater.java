public class TrappimgRainwater {
    public static int TrappedWater(int Height[]){
        int n = Height.length;

        // Calculate Left Max Boundary
        int leftMax[] = new int[n];
        leftMax[0] = Height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(Height[i],leftMax[i-1]);
        }

        // Calculate Right Max Boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = Height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(Height[i],rightMax[i+1]);
        }

        // Calculate Trapped Rainwater & Waterlevel
        int trappedRainwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedRainwater += waterlevel - Height[i];
        }
        return trappedRainwater;
    }

    public static void main(String[] args) {
        int Height[] = {7,1,4,3,2,1,8,};
        System.out.println(TrappedWater(Height));
    }
    
}
