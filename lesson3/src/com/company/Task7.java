package com.company;

import java.util.Scanner;

// Нарисовать бабочку

public class Task7 {

    public void function(Scanner scanner) {
        System.out.println("Input size of array: ");
        int size = scanner.nextInt();
        String[][] array = new String[size][size];


       for(int i = 0; i < array.length; i++)
           for(int j = 0; j < array[i].length;j++){
              if(j > i && j < array.length - i - 1  || j < i && j > array.length - i - 1){
                  array[i][j] = " ";
                  continue;
              }
              if(j <= array.length/2)
                  array[i][j] = String.valueOf(j + 1);
              else
                  array[i][j] = String.valueOf(array.length - j);
           }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
