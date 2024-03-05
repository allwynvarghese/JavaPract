package Arrays;

/*
* Given an integer array, return true if any value appears at least twice.
* Else return false if it is a distinct array
* */
public class RepeatingNums {

    public static boolean checkDistinct(int [] nums){

        int first = 0, last = nums.length -1;
        while(first < last){
            if(nums[first] == nums[last]){
                System.out.println("Repeating numbers in array");
                return false;
            }
            first ++;
            last --;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(checkDistinct(nums));
    }
}
