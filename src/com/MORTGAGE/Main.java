package com.MORTGAGE;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // JAVA has 2 implementation of dynamic Arrays:
        // CLASS 1: Vector<E>    (java.util) - will grow by 100% of its size when it gets FULL.
        //                                   - all the methods in Vector class are Synchronized
        //                                   - only a SINGLE THREAD can access that METHOD
        // CLASS 2: ArrayList<E> (java.util) - will grow by 50% of its size when it gets FULL.
        //                                   - the methods are NOT Synchronized
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(20);
        System.out.println(list);
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(20));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(20));
        System.out.println(list.contains(100));
        System.out.println(list.size());
        list.toArray(); // this will convert this list into a regular array OBJECT
        // there are times when you wanna work with a regular ARRAY OBJECT
        // lets say you have a METHOD that accepts ONLY AN ARRAY and you cannot pass
        // an ARRAYLIST CLASS THERE. in this case we can easily convert you ARRAYLIST into
        // regular Array Object.



    }

}