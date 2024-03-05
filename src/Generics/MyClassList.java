package Generics;

import java.util.ArrayList;
import java.util.List;

public class MyClassList<T> {

    List<T> list = new ArrayList<>();

    public void addStr(T str){
        list.add(str);
    }

    public void removeStr(T str){
        list.remove(str);
    }

    public T getValue(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
