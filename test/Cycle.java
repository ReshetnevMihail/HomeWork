package com.company;

import java.util.Scanner;

public class Cycle {

    public void function(Scanner input){
        System.out.println("Input range: ");

        int rage = input.nextInt();
        int sum = 0, even = 0, odd = 0;


        for(int i = 1; i <= rage; i++){
            sum += i;
            if (i % 2 == 0) {
                even += i;
            }else {
                odd += i;
            }
        }
        System.out.println("Result even: " + even);
        System.out.println("Result odd: " + odd);
        System.out.println("Result: " + sum);

    }


}
