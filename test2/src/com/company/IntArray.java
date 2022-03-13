package com.company;

import java.util.Random;
import java.util.Scanner;

public class IntArray {
   public static Scanner scanner;

    public static int[] inputArray(int size) {
        System.out.println("Input array");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + i + " element: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    public static int findMax(int[] array) {
        int max = 0;
        for (int i : array) {
            if (max < i)
                max = i;
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = 0;
        for (int i : array) {
            if (min < i)
                min = i;
        }
        return min;
    }

    public static int findUserNum(int[] array) {
        int index = 0;
        boolean flag = true;
        do {
            System.out.println("Input number: ");
            int userNumber = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (userNumber == array[i]) {
                    index = i;
                    flag = true;
                    break;
                } else {
                    System.out.println("404. Not found! Try again");
                    flag = false;
                }
            }
        } while (!flag);

        return index;
    }
//cool!
    public static int[] sortArray(int[] array) {

        int low = 0;
        int high = array.length;
        if (low >= high)
            return array;

        int middle = low + (high - low) / 2;
        int current = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < current) {
                i++;
            }

            while (array[j] > current) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sortArray(array);

        if (high > i)
            sortArray(array);

        return array;
    }

}
