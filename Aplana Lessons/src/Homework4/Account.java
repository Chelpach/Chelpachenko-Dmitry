package Homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chelp on 29.03.2017.
 */
public class Account{

    private String lastName;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private static ArrayList<Double> rAcc=new ArrayList<>();
    private static List<Double> cAcc=new ArrayList<>();



    public static void setrAcc(Double getClient) {
        rAcc.add(getClient);
    }

    public static void setcAcc(Double cAccCl) {
       cAcc.add(cAccCl);
    }

    public static List<Double> getrAcc() {
        return rAcc;
    }

    public static List<Double> getcAcc() {
        return cAcc;
    }



}
