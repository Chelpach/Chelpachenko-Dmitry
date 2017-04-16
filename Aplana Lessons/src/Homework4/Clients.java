package Homework4;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by chelp on 29.03.2017.
 */
public class Clients {

    private static List<Client> clients=new ArrayList<>();
    private static List<Client> clientsSoln=new ArrayList<>();



    public static void setClients(Client clientRoga) {
        clients.add(clientRoga);
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static List<Client> searchClient (String string){
        List<Client> searchClient =new ArrayList<>();
        for (Client x: clients){
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
