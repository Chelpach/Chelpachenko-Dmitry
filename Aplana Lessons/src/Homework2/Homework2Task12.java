package Homework2;

import java.util.Scanner;

/**
 * Для введённого пользователем с клавиатуры
 * натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
 * Created by chelp on 18.03.2017.
 */
public class Homework2Task12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Введите натуральное число");
        long ch=s.nextLong();
        long oldch=ch;
        long sum=0;
        while (ch!=0){
    sum+=(ch%10);
    ch/=10;
}
        System.out.println("Сумма всех цифр числа "+oldch+" равна "+ sum);
    }
}
