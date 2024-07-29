package by.tms.lesson_30_onl;

//import java.util.ArrayList;
//import java.util.List;

import by.tms.lesson_30_onl.ownarraylist.OwnArrayList;

public class Executor {
    public static void main(String[] args) {


        OwnArrayList<String> ownArrayList = new by.tms.lesson_30_onl.ownarraylist.fg.OwnArrayList(3);
        System.out.println(ownArrayList.toString());

        ownArrayList.add("String0");
        System.out.println(ownArrayList.size() + " " + ownArrayList.get(0));
        ownArrayList.add("String1");
        System.out.println(ownArrayList.size() + " " + ownArrayList.get(1));
        ownArrayList.add("String2");
        System.out.println(ownArrayList.size() + " " + ownArrayList.get(2));
        ownArrayList.add("String3");
        System.out.println(ownArrayList.size() + " " + ownArrayList.get(3));

        System.out.println(ownArrayList.remove(1));

        ownArrayList.set(0, "String4");
        System.out.println(ownArrayList.get(0));
//        int i = 0;

//        List<Integer> array = new ArrayList<Integer>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.remove(2);
//
//        int i = 0;

    }
}