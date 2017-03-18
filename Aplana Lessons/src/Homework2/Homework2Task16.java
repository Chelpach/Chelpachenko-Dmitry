package Homework2;

/**
 * В американской армии считается несчастливым число 13, а в японской — 4.
 * Перед международными учениями штаб российской армии решил исключить номера боевой техники,
 * содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег.
 * Если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от
 * 00001 до 99999, то сколько всего номеров придётся исключить?
 *
 * Created by chelp on 18.03.2017.
 */
public class Homework2Task16 {
    public static void main(String[] args) {
        Homework2Task14 a = new Homework2Task14();
        int sum = 0;
        for (int i = 1; i <= 99999; i++) {
            String str = Integer.toString(i);
            if (tabl(str)) sum++;


        } System.out.println("Придётся исключить "+sum+" номеров.");
    }

    static boolean tabl(String str) {
        if ((str.indexOf('4') != -1)||(str.indexOf("13")!=-1)) return true;
        return false;
    }
}


