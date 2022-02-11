package com.company;

import java.util.Random;
import java.util.Scanner;

//Создать Jagged Array

public class Task6 {
    public void function(Scanner scanner) {
        System.out.println("Input size of array: ");
        int[][] array = new int[scanner.nextInt()][];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter line size i" + i);
            array[i] = new int[scanner.nextInt()];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
