package com.company;

// Нарисовать в консоли шахматную доску (8x8)
// (нижняя левая клетка шахматной доски окрашена в чёрный цвет,
// следующая за ней — в белый, как и та, что над ней.
// Итак, цвет меняется каждый раз при переходе на соседнюю по стороне ячейку

public class Task1 {
    //bad method naming.
    public void function(){
        //9x9 looks strange due to 8x8 
        String[][] array = new String[9][9];
//why from 1? Not from 0 to 8?
        for (int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
                //hard to read. Think of a better solution
                if(i % 2 != 0) {
                    if(j % 2 != 0) {
                        array[i][j] = "\u25A0";
                    }else {
                        array[i][j] = "\u25A1";
                    }
                }else {
                    if(j % 2 == 0) {
                        array[i][j] = "\u25A0";
                    }else {
                        array[i][j] = "\u25A1";
                    }
                }
            }
        }

        for(int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
    }
}
