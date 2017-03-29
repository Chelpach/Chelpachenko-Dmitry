package Homework4;

/**
 * Created by chelp on 29.03.2017.
 */
public class Bank {
    private String bankName;

    public String getBankName() {
        System.out.println("Банк "+bankName+" приветствует Вас.");
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
