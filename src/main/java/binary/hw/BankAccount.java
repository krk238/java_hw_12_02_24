package binary.hw;

public class BankAccount {
    private String firstName;
    private String lastName;
    private static long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber ++;
    }

    public void addToBalance(double addMoney) {
        this.balance += addMoney;
        System.out.println("Your new balance is $" + this.balance);
    }

    public void withdrawMoney(double removeMoney) {
        this.balance -= removeMoney;
        System.out.println("Your new balance is $" + this.balance + ". And you have withdrawed: $" + removeMoney);
    }

    public void getAccountNumber() {
        System.out.println("Account number is " + accountNumber);
    }

    public static void main(String[] args) {
        BankAccount myA = new BankAccount("Kamil", "Khan");
        myA.addToBalance(12000.12);
        myA.withdrawMoney(300.67);
    }
}
