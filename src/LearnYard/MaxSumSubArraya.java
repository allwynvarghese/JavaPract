package LearnYard;

public class MaxSumSubArraya {

    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            currSum += arr[i];

            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println("Max sum: "+ maxSum);
    }
}
