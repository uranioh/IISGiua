package Bank;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Mario", "Rossi", 34.6);


        System.out.println("Number of active accounts: " + Account.getNumOf_Accounts());
        System.out.println(acc1.getData());
    }
}