package com.company;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        InputStreamReader scannerISR = new InputStreamReader(System.in);

        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();
        Task3 obj3 = new Task3();
        Task4 obj4 = new Task4();


        System.out.println("Choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                obj1.countСonsonants(scanner);
                break;
            case 2:
                obj2.outArray(scanner, scannerISR);
                break;
            case 3:
                obj3.findWord(scanner);
                break;
            case 4:
                obj4.outString(scanner);
                break;
            default:
                break;
        }
    }
}
