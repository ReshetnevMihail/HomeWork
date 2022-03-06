package com.company;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// Есть массив слов. Нужно отфильтровать его так,
// чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
// Было: {"width", "ellipse", "Wrong", "hyperbola», стало: [width, Wrong]
//+
public class Task2 {

    public static String[] initStringArray(Scanner scanner) {
        System.out.println("Input size of array");
        String[] array = new String[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + i + " element");
            array[i] = scanner.next();
        }
        return array;
    }

    public static char initFirstLetter(InputStreamReader scannerISR) throws IOException {
        System.out.println("Input letter: ");
        return (char) scannerISR.read();
    }

    public static int countNewArraySize(String[] array, char letter) {
        int counter = 0;
        for (String i : array) {
            if (i.charAt(0) == Character.toLowerCase(letter) || i.charAt(0) == Character.toUpperCase(letter))
                counter++;
        }
        return counter;
    }

    public String[] createNewArray(Scanner scanner, InputStreamReader scannerISR) throws IOException {
        String[] arrayOld = initStringArray(scanner);
        char letter = initFirstLetter(scannerISR);

        String[] arrayNew = new String[countNewArraySize(arrayOld, letter)];

        int j = 0;
        for (String i : arrayOld) {
            if (i.charAt(0) == Character.toLowerCase(letter) || i.charAt(0) == Character.toUpperCase(letter)) {
                arrayNew[j] = i;
                j++;
            } else {
                continue;
            }
        }
        return arrayNew;
    }

    public void outArray(Scanner scanner, InputStreamReader scannerISR) throws IOException {
        System.out.println("Result: " + Arrays.toString(createNewArray(scanner, scannerISR)));
    }
}
