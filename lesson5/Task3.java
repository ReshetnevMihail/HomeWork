package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

//Есть текст, пользователь вводит несколько слов.
// Надо проверить, есть ли они в тексте и в каком количестве

public class Task3 {

    public static String[] initWords(Scanner scanner) {
        System.out.println("Input words: ");
        return scanner.next().split(" ");
    }
//работает на честном слове
//запятые не учитываются, как и окночания

    public void findWord(Scanner scanner) throws IOException {

        String fileName = "D:\\JavaProject\\untitled2\\src\\com\\company\\WarAndPeace.txt";
        String[] array = initWords(scanner);

        String book = Files.lines(Paths.get(fileName)).reduce("", String::concat);

        int counter = 0;
        for (String j : array) {
            for (String i : book.split(" ")) {
                if (Objects.equals(j, i))
                    counter++;
            }
            System.out.println(counter);
        }
    }

}
