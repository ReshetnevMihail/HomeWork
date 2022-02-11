package com.company;

import java.util.Random;
import java.util.Scanner;

//Есть матрица. Посчитать сумму элементов в каждой строке
//ok
public class Task4 {

    public void function(Scanner scanner) {
        System.out.println("Input size of array: ");
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

       int sum = 0;

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += j;
            }
            System.out.println("Sum i" + i + ": " + sum);
            sum = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
