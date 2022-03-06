package com.company;

import java.util.Scanner;

// Есть строка “Green. red. blue. yellow”.
// Необходимо заменить все точки на запятые

public class Task4 {

    public static String initString(Scanner scanner) {
        System.out.println("Input string: ");
        return scanner.next();
    }

    public static String replaceDot(Scanner scanner) {
        String strOld = initString(scanner);
        return strOld.replace('.', ',');
    }

    public void outString(Scanner scanner){
        System.out.println(replaceDot(scanner));
    }

}
