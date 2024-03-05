/**
 * Calculate the amount of trapped rain waters amongst an array of bars.
 * Use auxiliary arrays
 */

package Arrays;

public class TrappedRainWater {

    public static int calcTrappedWater(int [] height){
        //1. Aux array 1 - calculate left max value
        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //2. Aux array 2 - calculate right max value
        int [] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //3. Loop
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //4. Calculate trapped rain water
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};
        System.out.println(calcTrappedWater(height));

    }
}
