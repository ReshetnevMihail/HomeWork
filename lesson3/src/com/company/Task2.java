package com.company;

// Вывести таблицу умножения используя двумерный массив

public class Task2 {

    public void function(){
      String[][] array = new String[10][10];//if 10x10 then I expect to se 10*10 and so on either. Your's max = 9x9

      int multiple = 0;
      String iStr;
      String jStr;
      String mulStr;

      for (int i = 1; i < 10; i++){
          iStr = String.valueOf(i);//int would be better, no need in such output. Think about perfomance firstly.
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
