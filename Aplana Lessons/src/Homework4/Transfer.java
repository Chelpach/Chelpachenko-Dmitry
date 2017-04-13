package Homework4;

/**
 * Created by chelp on 09.04.2017.
 */
public class Transfer {

    public static void betweenClientAccount(Client ccc, Client ccc1, double summ, String choice5){

        if (choice5.equalsIgnoreCase("1")){
            ccc.setCheckAccount(ccc.getCheckAccount()-summ);
            ccc.setrAcc(summ);

            ccc1.setCheckAccount(ccc1.getCheckAccount()+summ);
            ccc1.setrAcc(summ);

        }else if (choice5.equalsIgnoreCase("2")){
            ccc.setCurrentAccount(ccc.getCurrentAccount()-summ);
            ccc.setcAcc(summ);

            ccc1.setCheckAccount(ccc1.getCheckAccount()+summ);
            ccc1.setcAcc(summ);
        }else{
            System.out.println("Вы ввели не верный тип счёта");
        }
    }



}