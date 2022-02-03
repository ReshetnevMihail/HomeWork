package com.company;

import java.util.Scanner;

public class Main {
//inp- bad name
    public double inp(Scanner input){

        System.out.println("Input number: ");
        double number = input.nextDouble();

        return number;
    }

     public double sum(double num1, double num2, Scanner input){
        Main obj = new Main();// why do you create objects in all your methods? Bad. 
        num1 = obj.inp(input);
        num2 = obj.inp(input);

        num1 += num2;
//you print result in each method. It's code duplication. It will be better to place it after the work is done 
         System.out.println("Result: " + num1);

        return num1;

     }

    public double min(double num1, double num2, Scanner input){
        Main obj = new Main();// think of another approach. It looks bad.
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
//bad naming. Methods names are represented with verbs
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

        Scanner input = new Scanner(System.in);


            do {
                System.out.println("1) a + b");
                System.out.println("2) a - b");
                System.out.println("3) a * b");
                System.out.println("4) a / b");

                System.out.println("Choose an option: ");
                int choice = input.nextInt();

                switch (choice) {
//why do you use (..)? case 1: is ok too
                    case (1):
                        obj.sum(num1, num2, input);
                        break;
                    case (2):
                        obj.min(num1, num2, input);
                        break;
                    case (3):
                        obj.mul(num1, num2, input);
                        break;
                    case (4):
                        obj.div(num1, num2, input);
                        break;
                    default:
                        break;

                }
            } while (obj.answer(input) == 1);

            objCecle.function(input);

    }
}
