package Generics;

public class GenDemo {

    public static void main(String[] args) {
        //create a custom class based on an array list
        MyClassList<String> list = new MyClassList();
        list.addStr("Allwyn");
        list.addStr("Mamoth");
        list.addStr("Thadu");
        list.addStr("Nuru");
        list.removeStr("Allwyn");
        System.out.println(list);
        System.out.println(list.getValue(0));

        MyClassList<Integer> list2 = new MyClassList();
        list2.addStr(2);
        list2.addStr(3);
        list2.addStr(6);
        list2.removeStr(Integer.valueOf(2));
        System.out.println(list2);
        System.out.println(list2.getValue(1));
    }

}
