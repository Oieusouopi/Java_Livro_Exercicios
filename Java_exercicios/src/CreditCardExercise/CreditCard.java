package CreditCardExercise;

public class CreditCard {

    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    CreditCard(String no, String nm, String bk, double bal, int lim) {
        this.number = no;
        this.name = nm;
        this.bank = bk;
        this.balance = bal;
        this.limit = lim;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getBank() {
        return bank;
    }

    public double balance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean chargeIt(double price) {
        if (price + balance > (double) limit) {
            return false;
        } else {
            balance += price;
            return true;
        }
    }

    public void makePayment(double payment) {
        balance -= payment;
    }

    public static void printCard(CreditCard c) {
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance());
        System.out.println("Limit = " + c.getLimit());
    }
}
