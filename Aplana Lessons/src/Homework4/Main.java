package Homework4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**Написать программу позволяющую осуществлять банковские переводы.
 При запуске программы должно создаваться 2 банка:
 ООО Рога и копыта
 ООО Солнышко

 Программа должна позволять:
 1. Создавать клиентов банка
 2. Создавать счета клиентам банка(расчетный и текущий)
 3. Просматривать всех клиентов банка
 4. Просматривать информацию о счетах клиента
 5. Пополнять счета клиента
 6. Осуществлять перевод со счета на счет, должны соблюдаться правила:
 Переводы должны осуществляться в 3 этапа:
 Ввод данных
 Вывод информации о переводе(комиссия, полная сумма списания) и подтверждение платежа
 Результат перевода с указанием информации о переводе, остатке на счете
 Перевод между своими счетами осуществляется без комиссии
 Перевод на счета с одним типом и внутри одного банка осуществляется без комиссии
 Перевод в другой банк осуществляется с комиссией 5%
 Перевод на разные типы счетов осуществляется с комиссией 1%
 Баланс счета не может быть отрицательным
 7. Должна быть возможность выгрузки в файл всех операций клиентов банка.

 При выполнении задания надо постараться максимально использовать принципы ООП.
 * Created by chelp on 28.03.2017.
 */
public class Main {
    public static void main(String args[]) {
    Bank roga= new Bank("ООО Рога и копыта");
    Bank soln=new Bank("ООО Солнышко");
        //System.out.println("Заведите клиента в один из банков");
        //System.out.println("В какой из Банков завести клиента: Рога/Солнышко");
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        Scanner scanner3=new Scanner(System.in);
        Scanner scanner4=new Scanner(System.in);
        Scanner scanner5=new Scanner(System.in);
        Scanner scanner6=new Scanner(System.in);
        Scanner scanner7=new Scanner(System.in);
        Scanner scanner8=new Scanner(System.in);
        Scanner scanner9=new Scanner(System.in);
        Scanner scanner10=new Scanner(System.in);
        Scanner scanner11=new Scanner(System.in);
          String text = "";
          String fileName = "F:/a.txt";
        byte choice,choice1;
        String lastNameScan;
        do {
            System.out.println("Выберите нужное действие: ");
            System.out.println("1-Новый клиент");
            System.out.println("2-Создать счёт клиенту");
            System.out.println("3-Просмотреть всех клиентов");
            System.out.println("4-Просмотреть информацию о счетах клиента");
            System.out.println("5-Пополнить счёт клиента");
            System.out.println("6-перевод со счёта на счёт");
            System.out.println("7-Выгрузка в файл всех операций клиента");
            System.out.println("8-Выход");
            choice=scanner.nextByte();

        switch (choice){
            case 1:
                System.out.println("Выберите в какой банк будете заводить клиента:");
                System.out.println("1-"+ roga.getBankName()+" или 2-"+soln.getBankName());
                choice1=scanner.nextByte();
                if(choice1==1){
                   Client clientRoga=addClient(scanner2);
                    Clients.setClientsRoga(clientRoga);
                    System.out.println();
                }else if(choice1==2){
                    Client clientSoln=addClient(scanner2);
                    Clients.setClientsSoln(clientSoln);
                    System.out.println();
                }else {
                    System.out.println("Вы ввели не верный ID банка");
                }break;
            case 2:
                System.out.println("Введите Фамилию клиента, которому требуется завести счёт:");
                lastNameScan=scanner2.nextLine();
                //тут поиск по одному банку
                if (Clients.searchClient(lastNameScan)==null) {System.out.println("Клиент не найден");
                    System.out.println();break;}
                else Clients.searchClient(lastNameScan);
                Client b=Clients.searchClient(lastNameScan).get(0);
                System.out.println("Какой счёт необходимо создать?");
                System.out.println("1-расчётный, 2-текущий");
                byte choice2=scanner4.nextByte();
                if (choice2==1){
                 b.setCheckAccount(0);
                 Account acnt=new Account();
                 acnt.setFirstName(b.getFirstName());
                 acnt.setLastName(b.getLastName());
                }else if (choice2==2){
                    b.setCurrentAccount(0);
                }else{
                    System.out.println("Вы ввели не верный тип счёта");
                }
                    System.out.println();
                break;
            case 3:
                System.out.println("Клиенты банка "+roga.getBankName()+":");
                showClients(Clients.getClientsRoga());
                System.out.println("Клиенты банка: "+soln.getBankName()+":");
                showClients(Clients.getClientsSoln());
                System.out.println();
                break;
            case 4:
                System.out.println("Введите фамилию клиента:");
                String lastNameScan2=scanner3.nextLine();
                if (Clients.searchClient(lastNameScan2)==null) System.out.println("Клиент не найден");
                else Clients.searchClient(lastNameScan2);
                Client c=Clients.searchClient(lastNameScan2).get(0);
                if (c.getCheckAccount()!=-1){
                    System.out.print("Средств на Расчетном счете клиента: "+c.getCheckAccount()+" рублей.");
                }else {
                    System.out.println("Расчетный счёт не был открыт");
                }
                System.out.println();
                if (c.getCurrentAccount()!=-1){
                    System.out.print("Средств на Расчетном счете клиента: "+c.getCurrentAccount()+" рублей.");
                }else {
                    System.out.println("Текущий счёт ещё не был открыт.");
                }
                System.out.println();
                break;
            case 5:
                System.out.println("Введите фамилию клиента:");
                String lastNameScan3=scanner5.nextLine();
                if (Clients.searchClient(lastNameScan3)==null) System.out.println("Клиент не найден");
                else Clients.searchClient(lastNameScan3);
                Client cc=Clients.searchClient(lastNameScan3).get(0);



                System.out.println("Какой счёт необходимо пополнить?");
                System.out.println("1-расчётный, 2-текущий");
                byte choice3=scanner6.nextByte();
                System.out.println("Сумма пополнения?");
                double choice4=scanner7.nextDouble();
                if (choice3==1){
                cc.setCheckAccount(cc.getCheckAccount()+choice4);

                cc.setrAcc(choice4);
            }else if (choice3==2){
                cc.setCurrentAccount(cc.getCurrentAccount()+choice4);
                cc.setcAcc(choice4);
            }else{
                System.out.println("Вы ввели не верный тип счёта");
            }
                System.out.println();
                break;
            case 6:
                System.out.println("Введите фамилию клиента:");
                String lastNameScan4=scanner8.nextLine();
                if (Clients.searchClient(lastNameScan4)==null) System.out.println("Клиент не найден");
                else Clients.searchClient(lastNameScan4);
                Client ccc=Clients.searchClient(lastNameScan4).get(0);
                System.out.println("Перевод с 1-расчетного счета, 2-текущего счета");
                byte choice5=scanner4.nextByte();

                System.out.println("Кому выполнить перевод?");
                String lastNameScan5=scanner8.nextLine();
                if (Clients.searchClient(lastNameScan5)==null) System.out.println("Клиент не найден");
                else Clients.searchClient(lastNameScan5);
                Client ccc1=Clients.searchClient(lastNameScan5).get(0);

                System.out.println("Сумма перевода:");
                double summ=scanner11.nextDouble();
                if (choice5==1){
                    ccc.setCheckAccount(ccc.getCheckAccount()-summ);
                    ccc.setrAcc(summ);

                    ccc1.setCheckAccount(ccc1.getCheckAccount()+summ);

                    ccc1.setrAcc(summ);

                }else if (choice5==2){

                }else{
                    System.out.println("Вы ввели не верный тип счёта");
                }
                break;
            case 7:
                System.out.println("Введите фамилию клиента:");
                String lastNameScan6=scanner8.nextLine();
                if (Clients.searchClient(lastNameScan6)==null) System.out.println("Клиент не найден");
                else Clients.searchClient(lastNameScan6);
                Client ccc6=Clients.searchClient(lastNameScan6).get(0);

                write(fileName, ccc6.rAccPrint(Client.getrAcc()));
                break;
            case 8:
                break;
        }
    } while (choice!=8);

}

    public static void showClients(List<Client> clients){
        if (clients.size()==0){
            System.out.println("Нет клиентов");
        } else {
            for (Client x:clients){
                System.out.println(x.toString());
            }
    }
    }

    public static Client addClient (Scanner scanner){
        System.out.println("Введите фамилию:");
        String lastName=scanner.nextLine();
        System.out.println("Введите имя:");
        String firstName=scanner.nextLine();
        return new Client(lastName,firstName);
    }

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

}
