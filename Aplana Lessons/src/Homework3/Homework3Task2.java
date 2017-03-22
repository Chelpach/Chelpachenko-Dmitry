package Homework3;

import java.util.Random;

/**
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
 * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого
 * массива (его индекс не имеет значения).
 * Created by chelp on 20.03.2017.
 */
public class Homework3Task2 {
    public static void main(String args[]){
        int[][] massive=new int[5][8];
        Random random=new Random();

        for (int i=0; i<massive.length; i++){
            for (int j=0; j<massive[i].length; j++){
                int ss=random.nextInt(199)-99;
                massive[i][j]=ss;
            }
        }
        /*   for (int[] x:massive){
          for (int k:x){
              k=random.nextInt(199)-99;
          }
      }
*/
   for (int[] x:massive){
            for (int y:x){
                if (y>0&y<10)System.out.print("  "+y+" ");
                else if (y>10)System.out.print(" "+y+" ");
                else if (y<=0&y>(-10)) System.out.print(" "+y+" ");
                else System.out.print(y+" ");
                } System.out.println();
            }

        int ymax=0;
        int xmax=0;
   for (int i=0; i<massive.length; i++){
       for (int j=0; j<massive[i].length; j++){
           if (massive[xmax][ymax]<=massive[i][j]) {xmax=i; ymax=j;};
           }
   }
        System.out.println("Максимальный элемент массива: " +massive[xmax][ymax]);
    }
}
