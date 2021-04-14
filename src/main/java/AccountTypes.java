public abstract class AccountTypes {
    private double inAccount;

    public AccountTypes(double inAccount){
        this.inAccount = inAccount;
    }

    public void withdraw(double amount){
        inAccount -= amount;
    }

    public void deposit(double amount){
        inAccount += amount;
    }

    public double getInAccount(){
        return inAccount;
    }

    public abstract void giveTransfer(int account, double amount);



}
