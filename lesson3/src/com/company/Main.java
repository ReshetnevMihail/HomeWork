package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();
        Task3 obj3 = new Task3();
        Task4 obj4 = new Task4();
        Task5 obj5 = new Task5();
        Task6 obj6 = new Task6();
        Task7 obj7 = new Task7();

        System.out.println("1)Нарисовать в консоли шахматную доску (8x8) (нижняя левая клетка шахматной доски окрашена в чёрный цвет, следующая за ней — в белый, как и та, что над ней. Итак, цвет меняется каждый раз при переходе на соседнюю по стороне ячейку");
        System.out.println("2)Вывести таблицу умножения используя двумерный массив");
        System.out.println("3)Есть матрица. Найти в ней введенное пользователем число и вывести номер столбца и строки");
        System.out.println("4)Есть матрица. Посчитать сумму элементов в каждой строке");
        System.out.println("5)Есть матрица (квадратная). Посчитать сумму элементов, расположенных на главной диагонали");
        System.out.println("6)Создать Jagged Array ");
        System.out.println("7)Нарисовать бабочку");


        System.out.println("Choose an option: ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                obj1.function();
                break;
            case 2:
                obj2.function();
                break;
            case 3:
                obj3.function(scanner);
                break;
            case 4:
                obj4.function(scanner);
                break;
            case 5:
                obj5.function(scanner);
                break;
            case 6:
                obj6.function(scanner);
                break;
            case 7:
                obj7.function(scanner);
                break;
            default:
                break;

        }

    }
}
