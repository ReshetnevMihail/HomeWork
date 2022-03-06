package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskD {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        int[] arrayNew = new int[array.length - 1];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(array));

        int yuorNumber = scanner.nextInt();

        int j = 0;
        for(int i = 0; i  < array.length; i++){
            if(yuorNumber != array[i]){
                arrayNew[j] = array[i];
                j++;
            }

        }

        System.out.print("Array: ");
        System.out.println(Arrays.toString(arrayNew));
        }
    }
