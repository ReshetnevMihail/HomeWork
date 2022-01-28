package com.company;

//////Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//////сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Task1 {

    public void function(){
        int ameba = 1;
        //what is 24? 
        for(int i = 0; i <= 24; i +=3){
            ameba += ameba;
            //sout goes here. Read the task
        }
        System.out.println("Result: " + ameba);
//delete empty line
    }
//delete empty line
//delete empty line
}
