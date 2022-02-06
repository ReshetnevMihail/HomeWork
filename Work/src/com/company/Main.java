package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size: ");
        String[] strArray = new String[scanner.nextInt()];
        String strStart;
        String strEnd;

        int j = strArray.length - 1;

        for(int i = 0; i < strArray.length; i++) {
            System.out.println("Input word #" + i + ": ");
            strArray[i] = scanner.next();
        }

        System.out.print("Result array: ");
        for (String i : strArray) {
            System.out.print(i + ", ");
        }

        for(int i = 0; i < strArray.length/2; i++){
            strStart = strArray[i];
            strEnd = strArray[j];
            strArray[i] = strEnd;
            strArray[j] = strStart;
            j--;
            if(j == strArray.length/2)
                break;
        }
        System.out.println("");

        System.out.print("Result  array2: ");
        for (String i : strArray) {
            System.out.print(i + ", ");
        }
        System.out.println("");


        ////////

        System.out.println("Input size: ");
        int[] intArray = new int[scanner.nextInt()];

        for(int i = 0; i < intArray.length; i++) {
            System.out.println("Input number #" + i + ": ");
            intArray[i] = scanner.nextInt();
        }

        System.out.print("Result array: ");
        for (int i : intArray) {
            System.out.print(i + ", ");
        }


        System.out.println("");

        int sizeOfEven = 0;

        for(int i = 0; i < intArray.length; i++){

            if(intArray[i] % 2 == 0)
                sizeOfEven++;

        }
        int[] evenArray = new int[sizeOfEven];
        int lenghtOfEvevMin = 0;

        for(int i = 0; i < intArray.length; i++){

            if(intArray[i] % 2 == 0) {
                evenArray[lenghtOfEvevMin] = intArray[i];
                lenghtOfEvevMin++;
            }

        }

        System.out.print("Result even array: ");
        for (int i : evenArray) {
            System.out.print(i + ", ");
        }









    }
}
