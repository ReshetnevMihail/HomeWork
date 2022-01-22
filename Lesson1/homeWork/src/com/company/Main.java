package com.company;

import java.util.Scanner;

public class Main {


    public int inputFun(String str){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.print(str);
            while (!input.hasNextInt()){
                System.out.print("Incorrect input! Try again: ");
                input.next();
            }
            number = input.nextInt();
        }while (number <= 0);
        return number;
    }

    public void task21(String str1, String str2, String str3){
        Main obj = new Main();

        ////////task 2.1
        int num1 = obj.inputFun(str1);
        int num2 = obj.inputFun(str2);
        int num3 = obj.inputFun(str3);

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else {
            System.out.println("Result: " + num3);
        }

    }
    public void task22(String str1, String str2, String str3){
        Main obj = new Main();

        ////////task 2.2
        int num1 = obj.inputFun(str1);
        int num2 = obj.inputFun(str2);

        if(num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("multiple!");
        }else {
            System.out.println("not a multiple!");
        }
    }

    public void task23 (String str1, String str2, String str3){
        Main obj = new Main();

        ////////task 2.3
        String[] daysList = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        int num1 = obj.inputFun(str1);

        if(num1 <= 7){
            System.out.println(daysList[num1]);
        }else {
            System.out.println("Incorrect input!");
        }

    }

    public static void main(String[] args) {

        String str1 = new String("Enter first number: ");
        String str2 = new String("Enter second  number: ");
        String str3 = new String("Enter third number: ");
        Scanner input = new Scanner(System.in);
        Main obj = new Main();


        ////////task 3 ну почти...
        System.out.println("1)Пользователь вводит 3 числа. Найти максимальное и вывести его");
        System.out.println("2)Пользователь вводит 2 числа. Проверить кратное ли первое второму");
        System.out.println("3)Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.");
        System.out.println("Choose an option: ");
        int choice = input.nextInt();

        switch (choice){
            case (1):
                obj.task21(str1,str2,str3);
            break;
            case (2):
                obj.task22(str1,str2,str3);
            break;
            case (3):
                obj.task23(str1,str2,str3);
            break;
            default:
                break;

        }
        /////P.s. калькулятор в Pr1.2

    }
}
