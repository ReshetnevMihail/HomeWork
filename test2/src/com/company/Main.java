package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int sizeArray() {
        int size;
        boolean flag = true;
        do {
            System.out.println("Input size");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Try again: ");
                flag = false;
            } else
                flag = true;

        } while (!flag);
        return size;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Choice: ");
        int choiceArray = scanner.nextInt();
        switch (choiceArray) {
            case 1:
                int choiceRandom = scanner.nextInt();
                switch (choiceRandom) {
                    case 1:
                        int choiceFunction = scanner.nextInt();
                        switch (choiceFunction) {
                            case 1:
                                System.out.println(IntArray.findMax(IntArray.randomArray(sizeArray())));
                                break;
                            case 2:
                                System.out.println(IntArray.findMin(IntArray.randomArray(sizeArray())));
                                break;
                            case 3:
                                System.out.println(IntArray.findUserNum(IntArray.randomArray(sizeArray())));
                                break;
                            case 4:
                                System.out.println(Arrays.toString(IntArray.sortArray(IntArray.randomArray(sizeArray()))));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        int choiceFunction2 = scanner.nextInt();

                        switch (choiceFunction2) {
                            case 1:
                                System.out.println(IntArray.findMax(IntArray.inputArray(sizeArray())));
                                break;
                            case 2:
                                System.out.println(IntArray.findMin(IntArray.inputArray(sizeArray())));
                                break;
                            case 3:
                                System.out.println(IntArray.findUserNum(IntArray.inputArray(sizeArray())));
                                break;
                            case 4:
                                System.out.println(Arrays.toString(IntArray.sortArray(IntArray.inputArray(sizeArray()))));
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                int choiceStringFunction = scanner.nextInt();
                switch (choiceStringFunction) {
                    case 1:
                        StringArray.sortArray(StringArray.inputArray(sizeArray()));
                        break;
                    case 2:
                        StringArray.inpRandomNumber(StringArray.inputArray(sizeArray()));
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }


    }
}
