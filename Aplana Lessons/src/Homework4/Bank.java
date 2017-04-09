package Homework4;

/**
 * Created by chelp on 29.03.2017.
 */
public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }


    public String getBankName() {
        //System.out.println("Банк "+bankName);
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
