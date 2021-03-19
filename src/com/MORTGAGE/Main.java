package com.MORTGAGE;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(1);
        numbers.print();
        System.out.println(numbers.indexOf(100));
        System.out.println(numbers.indexOf(100000));
        System.out.println(numbers.indexOf(30)); // 1 because 20 was removed and other numbers
        // moved one step back
    }
}
