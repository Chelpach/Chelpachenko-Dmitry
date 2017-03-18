package Homework2;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 * Created by chelp on 17.03.2017.
 */
public class Homework2Task11 {
    public static void main(String[] args) {
        String st="";
        for (int i=1; i<=11; i++){
            st+=(fib(i)+" ");
        }
        System.out.println("Первые 11 членов последовательности Фибоначчи: " +st);
    }

    public static int fib(int n){
        int res;
        if (n==1) return res=1;if (n==2) return res=1;
        res=fib(n-2)+fib(n-1);
        return res;
    }
}
