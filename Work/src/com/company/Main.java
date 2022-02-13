package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] startArray = new int[scanner.nextInt()];
        int[] array1 = new int[startArray.length/2];
        int[] array2 = new int[startArray.length/2];

        Random random = new Random();

        for(int i = 0; i < startArray.length; i++){
            startArray[i] = random.nextInt(20);
        }

        int j = 0;
        for(int i = 0; i < startArray.length; i++){
            if(i < startArray.length/2)
                array1[i] = startArray[i];
            else{
                array2[j] = startArray[i];
                j++;
            }
        }

        int[] arrayCopy1 = Arrays.copyOfRange(startArray,0,startArray.length/2);
        int[] arrayCopy2 = Arrays.copyOfRange(startArray,startArray.length/2,startArray.length);;
        
        System.out.print("startArray: ");
        for (int i: startArray) {
            System.out.print(i + "\t");

        }
        System.out.println();
        System.out.print("Array1: ");
        for (int i: array1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("Array1: ");
        for (int i: array2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("ArrayCopy1: ");
        for (int i: arrayCopy1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("ArrayCopy2: ");
        for (int i: arrayCopy2) {
            System.out.print(i + "\t");
        }



    }
}
