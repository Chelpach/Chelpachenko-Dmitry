package Homework2;

import java.util.Random;

/**
 * Created by chelp on 15.03.2017.
 *  Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 Примеры работы программы:
 В числе 208 наибольшая цифра 8
 В числе 774 наибольшая цифра 7
 В числе 613 наибольшая цифра 6
 */
public class Homework2Task2 {
    public static void main(String[] args){
        int Cifra=0;
        Random R=new Random();
        int chislo=R.nextInt(900)+100;
        String ch=Integer.toString(chislo);
        char[] g=ch.toCharArray();
        int index=0;
        for (int i=0; i<g.length;i++){
            if (g[index]<=g[i]) {index=i;}
        }
        System.out.println("В числе "+chislo+" наибольшая цифра "+Character.getNumericValue(g[index]));
}
}
