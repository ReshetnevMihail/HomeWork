package com.company;

// Нарисовать в консоли шахматную доску (8x8)
// (нижняя левая клетка шахматной доски окрашена в чёрный цвет,
// следующая за ней — в белый, как и та, что над ней.
// Итак, цвет меняется каждый раз при переходе на соседнюю по стороне ячейку

public class Task1 {
    public void function(){
        String[][] array = new String[9][9];

        for (int i = 1; i < 9; i++){
            for(int j = 1; j < 9; j++){
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
