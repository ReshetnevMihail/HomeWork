package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();
        Task3 obj3 = new Task3();
        Task4 obj4 = new Task4();
        Task5 obj5 = new Task5();
        System.out.println("1)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.");
        System.out.println("2)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.");
        System.out.println("3)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см");
        System.out.println("4)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?.");
        System.out.println("5)Нарисовать треугольник.");

        System.out.println("Choose an option: ");
        int choice = input.nextInt();


        switch (choice) {
            case (1):
                obj1.function();
                break;
            case (2):
                obj2.function();
                break;
            case (3):
                obj3.function();
                break;
            case (4):
                obj4.function();
                break;
            case (5):
                obj5.function();
                break;
            default:
                break;

        }
    }
}
