package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//пользователь вводит текст. посчитать количество согласных

public class Task1 {

    public static String initString(Scanner scanner) {
        System.out.println("Input string: ");
        return scanner.next();
    }

    public void countСonsonants(Scanner scanner) {
        String str = initString(scanner);

        Pattern consonants = Pattern.compile("(?iu)[bcdfghjklmnpqrstvwxyzбвгджзйклмнпрстфхцчшщ]");
        Matcher matcher = consonants.matcher(str);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }
        System.out.println("Result: " + counter);
    }
}
