package Homework1;

public class Homework1Task3 {

    public static void main(String[] args) {
        double n; int p;
        n=4.835;
        p= (int) n; // усекание дробной части

        p=(int)Math.round(n);
        System.out.println("Ближайшее целое число вещественного числа "+n+" равно "+p);

    }
}