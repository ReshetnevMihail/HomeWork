package com.company;

///Напишите программу печати таблицы перевода расстояний из дюймов
///в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Task3 {

    public void function(){
        double cm = 2.54;
        System.out.println("Result: ");
        for(int i = 1; i <= 20; i++){
            System.out.print(i + "inch-" + cm * i + "cm, ");
        }

    }

}
