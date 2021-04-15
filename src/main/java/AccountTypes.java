public abstract class AccountTypes {
    private double balance;

    public AccountTypes(double inAccount) {
        this.balance = inAccount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getInAccount(){
        return balance;
    }

    public abstract void giveTransfer(int account, double amount);
}
