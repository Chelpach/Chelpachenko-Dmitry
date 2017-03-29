package Homework4;

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
Bank roga= new Bank();
Bank soln=new Bank();
roga.setBankName("ООО Рога и копыта");
soln.setBankName("ООО Солнышко");
roga.getBankName();
soln.getBankName();

        System.out.println("Заведите клиента в один из банков");
        System.out.println("В какой из Банков завести клиента: Рога/Солнышко");
        Scanner scanner=new Scanner(System.in);


        while (scanner.hasNext()) {
            String choice=scanner.nextLine();
            if (choice.equalsIgnoreCase("Рога")){
                System.out.println("Введите имя");
                String firstName=scanner.nextLine();
                System.out.println("Введите фамилию");
                String lastName=scanner.nextLine();
                //Clients clientsRoga=new Clients();
                Client clientRoga=new Client(firstName, lastName);
                Clients.setClientRoga(clientRoga);
                //тут делается ещё цикл на добавление ещё клиентов


            } else if(choice.equalsIgnoreCase("Солнышко")){

            }
        }



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

}
