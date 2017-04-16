package Homework4;

/**
 * Created by chelp on 09.04.2017.
 */
public class Transfer {

    public static void betweenClientAccount(Client ccc, double summ, Byte choice5){

        if (choice5==1){
            ccc.setCheckAccount(ccc.getCheckAccount()-summ);
            ccc.setrAcc(-summ);

            ccc.setCurrentAccount(ccc.getCurrentAccount()+summ);
            ccc.setcAcc(+summ);

        }else if (choice5==2){
            ccc.setCurrentAccount(ccc.getCurrentAccount()-summ);
            ccc.setcAcc(-summ);

            ccc.setCheckAccount(ccc.getCheckAccount()+summ);
            ccc.setrAcc(summ);
        }else{
            System.out.println("Вы ввели не верный тип счёта");
        }
    }

    public static void theSameClientAccount() {
        //свой счёт, свои одинаковые счета
            System.out.println("Перевод на один и тот же счёт одному клиенту");
    }

    public static void betweenDifferentClientTheSameAccount (Client ccc, Client ccc1, double summ, Byte choice5){
        // один банк разные клиенты, одинаковый тип счета

            if (choice5==1){

                ccc.setCheckAccount(ccc.getCheckAccount()-summ);
                ccc.setrAcc(-summ);

                ccc1.setCheckAccount(ccc1.getCheckAccount()+summ);
                ccc.setrAcc(+summ);

            }else if (choice5==2){

                ccc.setCurrentAccount(ccc.getCurrentAccount()-summ);
                ccc.setcAcc(-summ);

                ccc.setCheckAccount(ccc.getCheckAccount()+summ);
                ccc1.setcAcc(+summ);

            }else {
                System.out.println("Вы ввели не верный тип счёта");
            }
        }

    public static void betweenDifferentClientDifferentAccount (Client ccc, Client ccc1, double summ, Byte choice5){
        // один банк разные клиенты, разные счета
            if (choice5==1){

                ccc.setCheckAccount(ccc.getCheckAccount()-summ*1.01);
                ccc.setrAcc(-summ);

                ccc1.setCurrentAccount(ccc1.getCurrentAccount()+summ*1.01);
                ccc.setcAcc(+summ);

            }else if (choice5==2){

                ccc.setCurrentAccount(ccc.getCurrentAccount()-summ*1.01);
                ccc.setcAcc(-summ);

                ccc1.setCheckAccount(ccc1.getCheckAccount()+summ*1.01);
                ccc1.setrAcc(+summ);

            }else {
                System.out.println("Вы ввели не верный тип счёта");
            }
        }

    public static void betweenDifferentBanks (Client ccc, Client ccc1, double summ, Byte choice5, byte choice6){
        // один банк разные клиенты, разные счета
        if (choice5==1 & choice6==1){
            ccc.setCheckAccount(ccc.getCheckAccount()-summ*1.05);
            ccc.setrAcc(-summ);
            ccc1.setCheckAccount(ccc1.getCheckAccount()+summ*1.05);
            ccc.setrAcc(+summ);
        }else if (choice5==1 & choice6==2) {
            ccc.setCheckAccount(ccc.getCheckAccount() - summ * 1.05);
            ccc.setrAcc(-summ);
            ccc1.setCurrentAccount(ccc1.getCurrentAccount() + summ * 1.05);
            ccc1.setcAcc(+summ);
        }else if (choice5==2 & choice6==1) {
            ccc.setCurrentAccount(ccc.getCurrentAccount()-summ*1.05);
            ccc.setcAcc(-summ);
            ccc1.setCheckAccount(ccc1.getCheckAccount()+summ*1.05);
            ccc.setrAcc(+summ);
        }else if (choice5==2 & choice6==2){
            ccc.setCheckAccount(ccc.getCheckAccount() - summ * 1.05);
            ccc.setcAcc(-summ);
            ccc1.setCheckAccount(ccc1.getCheckAccount() + summ * 1.05);
            ccc1.setcAcc(+summ);
        }else {
            System.out.println("Вы ввели не верный тип счёта");
        }
    }

}