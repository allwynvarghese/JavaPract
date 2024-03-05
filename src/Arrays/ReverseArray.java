package Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int start = 0, end = arr.length-1;

        System.out.println("-----before-----");
        for(int val:arr){
            System.out.println(val);
        }

        int temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }

        System.out.println("-----after-----");
        for(int val:arr){
            System.out.println(val);
        }

        System.out.println("-----median-----");
        if(arr.length % 2 != 0){
            int median = (arr.length/2);
            System.out.println("median = "+ median);
            System.out.println("median element of array is "+ arr[median]);
        }else {
            System.out.println("No median element");
        }
    }
}
