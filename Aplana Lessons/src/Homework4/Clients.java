package Homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chelp on 29.03.2017.
 */
public class Clients {

    private static List<Client> clientsRoga=new ArrayList<>();
    private static List<Client> clientsSoln=new ArrayList<>();



    public static void setClientRoga(Client clientRoga) {
        clientsRoga.add(clientRoga);
    }

    public static void setClientsSoln(Client clientSoln) {
        clientsSoln.add(clientSoln);
    }


}
