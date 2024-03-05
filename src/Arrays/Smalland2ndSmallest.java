package Arrays;

public class Smalland2ndSmallest {

    public static void main(String[] args) {
        int [] arr = {2,4,-3,5,-6};
        int small= Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;

        //lowest
        for(int i =0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }

        //2nd lowest
        for(int i =0;i<arr.length;i++){
            if(arr[i]<small2 && arr[i] != small){
                small2 = arr[i];
            }
        }
        System.out.println("small: "+ small + " small2: "+ small2);
    }
}
