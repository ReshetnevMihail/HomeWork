package com.company;

import java.util.Random;
import java.util.Scanner;

public class TaskD {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();
        int maxInt = array[0];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(20);
        }

        System.out.print("Array: ");
        for (int i: array) {
            System.out.print(i + "\t");
        }

        int temp;

        for(int i = 0; i< array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if( array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.print("Array: ");
        for (int i: array) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println("Result max sum: " + (array[array.length - 1] + array[array.length - 1]));
        System.out.println();

        System.out.println("Result min subtraction: " + (array[0] - array[1]));

    }
}
