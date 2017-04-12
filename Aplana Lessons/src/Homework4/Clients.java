package Homework4;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chelp on 29.03.2017.
 */
public class Clients {

    private static List<Client> clientsRoga=new ArrayList<>();
    private static List<Client> clientsSoln=new ArrayList<>();



    public static void setClientsRoga(Client clientRoga) {
        clientsRoga.add(clientRoga);
    }

    public static void setClientsSoln(Client clientSoln) {
        clientsSoln.add(clientSoln);
    }


    public static List<Client> getClientsRoga() {
        return clientsRoga;
    }

    public static List<Client> getClientsSoln() {
        return clientsSoln;
    }


    public static List<Client> searchClient (String string){
        List<Client> searchClient =new ArrayList<>();
        for (Client x: clientsRoga){
            if (x.getLastName().equalsIgnoreCase(string)){
                searchClient.add(x);
            }
        }if (searchClient.size()==0) {
            for (Client x : clientsSoln) {
                if (x.getLastName().equalsIgnoreCase(string)) {
                    searchClient.add(x);
                }
            } if (searchClient.size()==0) return null;
        }return searchClient;
    }



}
