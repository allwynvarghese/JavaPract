package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiDemo {


    public static void main(String[] args) {
        int arr[] = {1,7,25,76,100, 6};

        System.out.println(Arrays.stream(arr).map(n->n*2).reduce(0, (a,b)->a+b));


    }
}
