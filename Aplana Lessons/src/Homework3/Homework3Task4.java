package Homework3;

import java.util.Random;

/**Разработать java-класс, задача которого генерация случайного регистрационного знака транспортного средства
 * (ТС) в формате:
 «М 000 ММ 55 или М 000 ММ 555», где
 0 и М - соответственно цифра и буква, означающие номер и серию регистрационного знака ТС;
 5 - цифра кода региона Российской Федерации, применяемых на регистрационных знаках ТС.
 (Государственный стандарт РФ ГОСТ Р 50577-93)

 А, В, Е, К, М, Н, О, Р, С, Т, У и Х.
 * Created by chelp on 21.03.2017.
 */
public class Homework3Task4 {
    public static void main(String args[]){
        Nomer nomer=new Nomer();
        System.out.println("Случайно сгенерированный регистрационный знак ТС:");


nomer.fullGenerate();}

}

class Nomer {
    Random random = new Random();

    public void fullGenerate() {
        //заранее присваиваем переменной значение метода генерации рег знака, чтобы использовать один из выводов
        int a=generateRegion();
        if (a < 10)
            System.out.println(generateSerial() + " " + generateNumber() + generateNumber() + generateNumber() + " " + generateSerial() + generateSerial() + " 0" + a);
        else
            System.out.println(generateSerial() + " " + generateNumber() + generateNumber() + generateNumber() + " " + generateSerial() + generateSerial() + " " + a);
    }

    private char generateSerial() {
        char[] bukva = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};
        char randBu = bukva[random.nextInt(12)]; //выбор буквы
        return randBu;
    }

    private int generateNumber() {
        int b = random.nextInt(10);//выбор цифры
        return b;
    }

    private int generateRegion() {
        int[] M = {2,3}; //выбор между регионом с двумя знаками или тремя
        int[] region3 = {102, 113, 116, 121, 123, 124, 125, 126, 134, 136, 138, 142, 150, 190, 750, 152, 154, 159, 161, 163, 164, 196, 173, 174, 177, 197, 199, 777, 178, 186};
        int threeNumbers, twoNumbers;

        int twoOrThree = M[random.nextInt(2)]; //два знака или три

        if (twoOrThree == 3) {              //выходим из метода с тройным кодом региона
            threeNumbers = region3[random.nextInt(region3.length)];
            return threeNumbers;
        } else {                            //выходим из метода с двойным кодом региона
            twoNumbers = random.nextInt(10);
            twoNumbers = twoNumbers * 10 + random.nextInt(10);
        }
        if (twoNumbers == 0) {  // исключаем возможность появления кода региона 00
            do {
                twoNumbers = random.nextInt(10);
                twoNumbers = twoNumbers * 10 + random.nextInt(10);
            }
            while (twoNumbers == 0);

        } return twoNumbers;
    }
}