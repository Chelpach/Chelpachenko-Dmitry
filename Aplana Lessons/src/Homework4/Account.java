package Homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chelp on 29.03.2017.
 */
public class Account {



    private static List<Clients> rAcc=new ArrayList<>();
    private static List<Clients> cAcc=new ArrayList<>();

    public static void setrAcc(Clients rAccCl) {
        rAcc.add(rAccCl);
    }

    public static void setcAcc(Clients cAccCl) {
       cAcc.add(cAccCl);
    }
}
