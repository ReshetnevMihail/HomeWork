package com.company;

import java.util.Scanner;

/// Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
public class Task2 {

    public void function(){
        Scanner input = new Scanner(System.in);
        int numA = input.nextInt();
        int numB = input.nextInt();
        int result = 0;
        //what about negative numbers? Your solution does not cover all cases.
        //Also it does not properly calculate positive numbers either.
        for(int i = 0; i <= numB; i++){
            result += numA;
        }
//empty line
        System.out.println("Result: " + result);

    }
}
