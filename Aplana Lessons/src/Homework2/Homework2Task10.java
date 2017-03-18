package Homework2;

import java.util.Scanner;

/**
 * Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
 * Постарайтесь не выполнять лишних действий (например, после того,
 * как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
 * Также учтите, что наименьший делитель натурального числа n, если он вообще имеется,
 * обязательно располагается в отрезке [2; √n].
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int ch = s.nextInt();

        if (simple(ch)) System.out.println("Число " + ch + " является простым");
        else System.out.println("Число " + ch + " не является простым");
    }


    static boolean simple(int ch) {
        int j = 0; boolean a=true;
        if (ch == 1) return true;
        for (int i = 2; i <= Math.sqrt(ch); i++) {
            if (ch % i ==0) {j++; break;
            }
        } if (j==0) return a;
        else return (!a);
    }
}
