package com.company;

import java.util.Scanner;

//Есть матрица.
//Найти в ней введенное пользователем число и вывести номер столбца и строки
//ok
public class Task3 {
    public void function(Scanner scanner) {
        System.out.println("Input size of array: ");
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        int yourNumber;

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println("input " + i +" "+ j +": ");
                array[i][j] = scanner.nextInt();

            }
        }

        boolean notFound = true;

        do {
            System.out.println("Input your number: ");
            yourNumber = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == yourNumber) {
                        notFound = false;
                        System.out.println("Number index: " + "i:" + i + " j:" + j);
                    }
                }
            }
            if (notFound)
                System.out.println("Your number is missing. Try again");

        }while (notFound);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
