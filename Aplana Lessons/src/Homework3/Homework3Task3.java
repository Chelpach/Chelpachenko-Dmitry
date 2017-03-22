package Homework3;

import java.util.Random;

/**
 * Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
 * второй — с предпоследним и т.д.), и вновь печатает.
 *
 * Created by chelp on 21.03.2017.
 */
public class Homework3Task3 {
    public static void main(String args[]){

        int[] massive=new int[10];
        int[] massive2=new int[10];
        Random random=new Random();
        System.out.println("Оригинальный массив");
        for (int i=0; i<massive.length; i++){
            massive[i]=random.nextInt(100)+10;
            System.out.print(massive[i]+" ");
        }System.out.println();

  /*    for (int x:massive) {
            x=random.nextInt(100)+10;
            System.out.print(x+" ");
        }System.out.println();
*/
        System.out.println("Инвертированный массив");
        for (int i=0; i<massive.length; i++){
            massive2[massive2.length-1-i]=massive[i];
            }

        for (int i=0; i<massive2.length; i++){
            System.out.print(massive2[i]+" ");
        }

    }
}
