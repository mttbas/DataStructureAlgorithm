package com.MORTGAGE;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // first DATA STRUCTURE
        // ARRAY TYPE ONE
        int[] numbers = new int[3]; // fixed size
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        // ARRAY TYPE TWO
        int[] numbersTwo = {10, 20, 30}; // fixed size
        System.out.println(Arrays.toString(numbersTwo));
        System.out.println(numbers.length);


    }
}
