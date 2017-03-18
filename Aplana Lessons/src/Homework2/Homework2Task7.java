package Homework2;

/**
 *  Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task7 {
    public static void main(String[] args){
int j=0; int i=2;
        while (j<20){
            System.out.print(i+" ");
    i*=2;
    j++;
}
    }
}
