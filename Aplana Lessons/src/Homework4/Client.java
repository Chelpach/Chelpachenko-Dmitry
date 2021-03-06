package Homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chelp on 29.03.2017.
 */
public class Client {
    private String lastName;
    private String firstName;
    private byte bank;

    public byte getBank() {
        return bank;
    }

    public void setBank(byte bank) {
        this.bank = bank;
    }

    public Client(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                '}';
    }

    private double currentAccount=-1;
    private double checkAccount=-1;


    public double getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(double checkAccount) {
        this.checkAccount = checkAccount;
    }

    public double getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(double currentAccount) {
        this.currentAccount = currentAccount;
    }

    private  ArrayList<Double> rAcc=new ArrayList<>();
    private ArrayList<Double> cAcc=new ArrayList<>();


    public  void setrAcc(Double getClient) {
        rAcc.add(getClient);
    }

    public  void setcAcc(Double cAccCl) {
        cAcc.add(cAccCl);
    }

    public  ArrayList<Double> getrAcc() {
        return rAcc;
    }

    public ArrayList<Double> getcAcc() {
        return cAcc;
    }

}
