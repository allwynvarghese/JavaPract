package CollectionFw;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(5);

        //add elements to the arrayList
        al.add(10);
        al.add(1, 11);
        al.add(2, 13);
        al.add(15);

        //remove
        al.remove(Integer.valueOf(13));

        //List iterator
        Iterator<Integer> it = al.listIterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}
