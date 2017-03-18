package Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Homework1Task5 {
    public static void main(String[] args) throws IOException{
        char c; double veneraWeight;
        String weight="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите вес(кг) на Земле:");
    do{
     c=(char) br.read();
    if(c=='\n') break;
    weight+=c;
} while (c!='\n');
        try {
            Integer w =new Integer(weight);
            int earthWeight=w;
            veneraWeight=0.9*earthWeight;
            System.out.println("Вес на Венере будет равен "+veneraWeight+" кг.");
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }



    }
}
