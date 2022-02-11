package com.company;

// Вывести таблицу умножения используя двумерный массив

public class Task2 {

    public void function(){
      String[][] array = new String[10][10];

      int multiple = 0;
      String iStr;
      String jStr;
      String mulStr;

      for (int i = 1; i < 10; i++){
          iStr = String.valueOf(i);
          for(int j = 1; j < 10; j++){
              multiple = i * j;

              jStr = String.valueOf(j);
              mulStr = String.valueOf(multiple);

              array[i][j] = iStr + "*" + jStr + "=" + mulStr;
          }
      }

      for(int i = 1; i < 10; i++){
          for(int j = 1; j < 10; j++){
              System.out.print(array[i][j] + "\t");
          }
          System.out.println();
      }
    }
}
