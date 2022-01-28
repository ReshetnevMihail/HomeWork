package com.company;

import java.util.Scanner;

/// Нарисовать треугольники
public class Task5 {

    public void function(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input size: ");
        int num = input.nextInt();
        int midl = num;
            for (int i = 1; i <= num; i++) {///количество столбцов
               for(int c = midl; c >= 0; c--) {///отступ от края
                   System.out.print(" ");
               }
              midl--;
                   for (int j = 1; j <= i; j++) {///количество звезд в строке
                       System.out.print("* ");
                   }
                System.out.println("\n");
            }

        System.out.println("///////////////////");
        System.out.println("\n");

        for (int i = 1; i <= num; i++) {
            for(int c = 0; c <= midl; c++) {
                System.out.print(" ");
            }
            midl++;
            for (int j = num; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }


            }




}
