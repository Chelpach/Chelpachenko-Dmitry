package Homework2;

/**
 * Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task5 {
    public static void main(String[] args){
        int i=1; int j=0;
        do{System.out.print(i+" ");
        i+=2;
        j++;
        } while (j<55);
    }
}
