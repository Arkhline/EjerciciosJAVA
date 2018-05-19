package ar.edu.ottokrause.psr;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lala = new ArrayList<>();

        IntegerList list = new IntegerArrayList(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.set(4, 9);


        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());
        list.add(0, 10);
        list.add(11);
    }
}
