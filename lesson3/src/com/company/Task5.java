package com.company;

import java.util.Random;
import java.util.Scanner;

//Есть матрица (квадратная).
// Посчитать сумму элементов, расположенных на главной диагонали:

public class Task5 {
    public void function(Scanner scanner) {
        System.out.println("Input size of array: ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        int sum = 0;
        int index = 0;
//ok, but could be more "mathematical"
        for (int i = 0; i < array.length; i++){
           sum += array[i][index];
            index++;
        }
        System.out.println("Result: " + sum);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
