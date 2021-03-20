package com.MORTGAGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        list.addFirst(1002);
        list.addFirst(120);
        list.addFirst(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.contains(1002));
        System.out.println(list.indexOf(1002));
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
        var array = list.toArray();
        // in times you wanna work with array you can convert a Linked List in Array
        // now we can USE ARRAY CLASS to convert this Array into String
        System.out.println(Arrays.toString(array));
    }

}