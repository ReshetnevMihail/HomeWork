package com.company;

import java.util.Date;

public class Main {

    public void outDate(char[] date) throws InterruptedException {
        for (int i = 0; i < date.length; i++) {
            Thread.sleep(500);
            System.out.print(date[i]);
        }
    }

    public static void badDate(Date date) {
        System.out.println(date);

    }


    public static void main(String[] args) throws InterruptedException {
        char[] date = {'6', ' ', 'м', 'а', 'р', 'т', 'а', ' ', '2', '0', '2', '2', ' ', 'г', 'о', 'д', 'а'};
        Main obj = new Main();
        Date objDate = new Date();

        obj.outDate(date);
      
        badDate(objDate);


    }
}