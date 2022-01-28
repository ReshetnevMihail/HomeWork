package com.company;

///Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?
public class Task4 {

    public void function(){
        double norm = 10;
        //what is 7?
       for(int i = 0; i <= 7; ++i){
           double percent = norm * 10/100;
           norm += percent;
       }
        System.out.println("Result: " + norm + "Km");
    }

}
