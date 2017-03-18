package Homework2;

import java.util.Scanner;

/**
 *  Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = s.nextInt();
System.out.println("Факториал числа "+n+ " равен "+Factorial(n));
    }


    private static long Factorial(int x) {
long fact;
if (x==1) return x=1;
fact=Factorial(x-1)*x;
return fact;
    }
}