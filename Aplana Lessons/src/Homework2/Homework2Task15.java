package Homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *Электронные часы показывают время в формате от 00:00 до 23:59.
 * Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
 * что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 *
 * Created by chelp on 18.03.2017.
 */
public class Homework2Task15 {
    public static void main(String[] args) {
        int sum=0;
        int[] mass = new int[4];
        for (int i = 0; i <= 2; i++) {
            mass[0] = i;
            for (int j = 0; j <= 9; j++) { if ((i==2)&(j>=4)) continue;
                mass[1] = j;
                for (int k = 0; k <= 5; k++) {
                    mass[2] = k;
                    for (int f = 0; f <= 9; f++) {
                        mass[3] = f;
if((mass[0]==mass[3])&mass[1]==mass[2]) sum++;
                    }
                }
            }
        }System.out.println("Количество комбинаций равно: "+sum);
    }

}