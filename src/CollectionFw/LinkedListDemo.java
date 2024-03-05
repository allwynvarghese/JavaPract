package CollectionFw;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        for(int i=1;i<11;i++){
            ll.add(i);
        }

        System.out.println("Before");
        ll.forEach(System.out::print);

        ll.addFirst(2);
        ll.addLast(5);

        System.out.println("");
        System.out.println(ll);

        System.out.println(ll.peek());
        System.out.println(ll.peekLast());

        }
    }

