package com.company;

//////Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//////сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Task1 {

    public void function(){
        int ameba = 1;
        for(int i = 0; i <= 24; i +=3){
            ameba += ameba;
        }
        System.out.println("Result: " + ameba);

    }


}
