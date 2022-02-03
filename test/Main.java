package com.company;

import java.util.Scanner;

public class Main {

    public double inp(Scanner input){

        System.out.println("Input number: ");
        double number = input.nextDouble();

        return number;
    }

     public double sum(double num1, double num2, Scanner input){
        Main obj = new Main();
        num1 = obj.inp(input);
        num2 = obj.inp(input);

        num1 += num2;
         System.out.println("Result: " + num1);

        return num1;

     }

    public double min(double num1, double num2, Scanner input){
        Main obj = new Main();
        num1 = obj.inp(input);
        num2 = obj.inp(input);

        num1 -= num2;
        System.out.println("Result: " + num1);

        return num1;

    }
    public double mul(double num1, double num2, Scanner input){
        Main obj = new Main();
        num1 = obj.inp(input);
        num2 = obj.inp(input);

        num1 *= num2;
        System.out.println("Result: " + num1);

        return num1;

    }

    public double div(double num1, double num2, Scanner input){
        Main obj = new Main();
        num1 = obj.inp(input);
        num2 = obj.inp(input);

        num1 /= num2;
        System.out.println("Result: " + num1);

        return num1;

    }

    public int answer(Scanner input){
        int answer ;
        do {

            System.out.println("Do you want to continue? Press 1 else 0");
            answer = input.nextInt();
            if(answer > 1 || answer < 0)
                System.out.println("Incorrect input! Try again ");

        }while (answer > 1 || answer < 0);

        return answer;
    }


    public static void main(String[] args) {
        Main obj = new Main();
        Cycle objCecle = new Cycle();
        double num1 = 0, num2 = 0;
        int answer = 0;

        Scanner input = new Scanner(System.in);


            do {
                System.out.println("1) a + b");
                System.out.println("2) a - b");
                System.out.println("3) a * b");
                System.out.println("4) a / b");

                System.out.println("Choose an option: ");
                int choice = input.nextInt();

                switch (choice) {
                    case (1):
                        obj.sum(num1, num2, input);
                        answer  = obj.answer(input);
                        break;
                    case (2):
                        obj.min(num1, num2, input);
                        answer  = obj.answer(input);
                        break;
                    case (3):
                        obj.mul(num1, num2, input);
                        answer  = obj.answer(input);
                        break;
                    case (4):
                        obj.div(num1, num2, input);
                        answer  = obj.answer(input);
                        break;
                    default:
                        break;

                }
            } while (answer == 1);
            
            objCecle.function(input);

    }
}
