import java.util.ArrayList;
import java.util.Random;

public abstract class AccountTypes {
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<String>();

    public AccountTypes(double inAccount) {
        this.balance = inAccount;
        Random randNum = new Random();
        accountNumber = randNum.nextInt(1000000);
    }

    public boolean withdraw(double amount) {
        amount = Console.twoDecimalPlaces(amount);
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                transactionHistory.add(String.format("Withdrew $%.2f, Account balance $%.2f", amount, balance));
                return true;
            }
        }
        return false;
    }


    public boolean deposit(double amount) {
        amount = Console.twoDecimalPlaces(amount);
        if(amount > 0) {
            balance += amount;
            transactionHistory.add(String.format("Deposited $%.2f, Account balance $%.2f", amount, balance));
            return true;
        }
        else {
            return false;
        }
    }


    public double getInAccount(){
        return balance;
    }


    public abstract void giveTransfer(int account, double amount);


    public boolean transferTo(Account otherAccount, double amount) {
        amount = Console.twoDecimalPlaces(amount);
        boolean validWithdraw = this.withdraw(amount);
        if(validWithdraw) {
            boolean depositWorked = otherAccount.deposit(amount);
            return depositWorked;
        }
        return false;
    }

    public String formatTransactionHistory() {
        String output = "";
        for(String transaction: transactionHistory) {
            output += transaction + "\n";
        }
        return output;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
