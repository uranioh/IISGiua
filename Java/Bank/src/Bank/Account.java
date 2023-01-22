package Bank;

public class Account {

    // final è una costante che può essere assegnata una sola volta dopo la sua dichiarazione
    // const è una costante che DEVE essere obbligatoriamente assegnata alla dichiarazione
    private final String fName, lName;
    private double balance;

    private static int numOf_Accounts;

    public Account(String fName, String lName, double balance) {
        numOf_Accounts++;

        this.fName = fName;
        this.lName = lName;
        this.balance = balance;
    }

    public static int getNumOf_Accounts() {
        return numOf_Accounts;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getData() {
        return String.format("First name: %s \nLast name: %s \nBalance: %.2f", fName, lName, balance);
    }
}
