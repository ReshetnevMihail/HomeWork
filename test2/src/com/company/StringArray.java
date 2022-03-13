package com.company;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringArray {
    public static Scanner scanner;
    public static InputStreamReader scannerISR;

    public static String[] inputArray(int size) {
        System.out.println("Input array");
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + i + " element: ");
            array[i] = scanner.next();
        }
        return array;
    }

    public static String[] sortArray(String[] array) {
        Arrays.sort(array);
        return array;
    }

    public static String[] inpRandomNumber(String[] array) throws IOException {
        Random random = new Random();
        System.out.println("Input latter to change: ");
        char yourLetter = (char) scannerISR.read();
        StringBuilder str = new StringBuilder(array[0]);
        for(int i  = 1; i< array.length;i++){
            str.append(" ").append(array[i]);
        }

        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == yourLetter){
                str.insert(i, random);
            }
        }

        return array;
    }


}
