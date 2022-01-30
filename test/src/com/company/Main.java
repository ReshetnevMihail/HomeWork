package com.company;

import java.util.Scanner;

public class Main {

    public double inp(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        double number = input.nextDouble();

        return number;
    }

     public double sum(){
        Main obj = new Main();
        double num1 = obj.inp();
        double num2 = obj.inp();

        num1 += num2;
         System.out.println("Result: " + num1);

        return num1;

     }

    public double min(){
        Main obj = new Main();
        double num1 = obj.inp();
        double num2 = obj.inp();

        num1 -= num2;
        System.out.println("Result: " + num1);

        return num1;

    }
    public double mul(){
        Main obj = new Main();
        double num1 = obj.inp();
        double num2 = obj.inp();

        num1 *= num2;
        System.out.println("Result: " + num1);

        return num1;

    }

    public double div(){
        Main obj = new Main();
        double num1 = obj.inp();
        double num2 = obj.inp();

        num1 /= num2;
        System.out.println("Result: " + num1);

        return num1;

    }

    public static void main(String[] args) {
        Main obj = new Main();

        Scanner input = new Scanner(System.in);

        int ans = 0;

            do {
                System.out.println("1) a + b");
                System.out.println("2) a - b");
                System.out.println("3) a * b");
                System.out.println("4) a / b");

                System.out.println("Choose an option: ");
                int choice = input.nextInt();
//solution could be better. Duplicated code
                switch (choice) {
                    case (1):
                        obj.sum();
                        System.out.println("Do you want to continue? Press 1 else 0");
                         ans = input.nextInt();
                        break;
                    case (2):
                        obj.min();
                        System.out.println("Do you want to continue? Press 1 else 0");
                        ans = input.nextInt();
                        break;
                    case (3):
                        obj.mul();
                        System.out.println("Do you want to continue? Press 1 else 0");
                        ans = input.nextInt();
                        break;
                    case (4):
                        obj.div();
                        System.out.println("Do you want to continue? Press 1 else 0");
                        ans = input.nextInt();
                        break;
                    default:
                        break;

                }
            } while (ans == 1);



            System.out.println("Input range: ");

            int rage = input.nextInt();
//What did I say about this task at the previous lesson? We could use 1 loop instead of 3!
//Should be placed in a different class
            int sum= 0;
            for(int i = 2; i <= rage; i +=2){
                sum += i;
            }
        System.out.println("Result even: " + sum);

            sum = 0;

            for(int i = 1; i <= rage; i += 2){
                sum += i;
            }
        System.out.println("Result odd: " + sum);

        sum = 0;

            for(int i = 0; i <= rage; i++){
                sum += i;
            }
        System.out.println("Result: " + sum);


    }
}
