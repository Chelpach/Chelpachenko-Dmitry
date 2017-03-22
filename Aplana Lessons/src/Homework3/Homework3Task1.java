package Homework3;

import java.util.Random;

/**Создать двумерный массив из 8 строк по 5 столбцов в каждой
 *  из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
 * Created by chelp on 20.03.2017.
 */
public class Homework3Task1 {
    public static void main(String[] args) {
int massive[][]= new int[8][5];
Random s=new Random();

for (int i=0; i<massive.length; i++){
    for (int j=0; j<massive[i].length; j++){
        int ss=s.nextInt(90)+10;
        massive[i][j]=ss;

    }
}
for (int[] x:massive){
            for (int y:x){
                System.out.print(y+" ");
            } System.out.println();
        }

    }
}
