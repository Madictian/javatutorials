package Totalbeginner;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Bog> list = new ArrayList<>();

        Bog b1 = new Bog("Great Expectations");
        Bog b2 = new Bog("War and Peace");
        list.add(b1);
        list.add(b2);

        Person p1 = new Person();
        p1.setName("fred");
        b1.setPerson(p1);

        System.out.println(list.get(0).getPerson().getName());
        System.out.println(list.indexOf(b2));
    }
}
