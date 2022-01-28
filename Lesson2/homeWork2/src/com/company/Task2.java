package com.company;

import java.util.Scanner;

/// Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task2 {

    public void function(){
        Scanner input = new Scanner(System.in);
        int numA = input.nextInt();
        int numB = input.nextInt();
        int result = 0;
        for(int i = 0; i <= numB; i++){
            result += numA;
        }

        System.out.println("Result: " + result);

    }
}
