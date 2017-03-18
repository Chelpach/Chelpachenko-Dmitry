package Homework2;

import java.util.Scanner;

/**
 * Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int ch=s.nextInt();
        String st="";
    for (int i=1; i<=ch; i++){
        if (ch%i==0)
        st+=i+" ";
        }System.out.println("Делителями числа "+ ch +" являются: "+ st);
    }
}
