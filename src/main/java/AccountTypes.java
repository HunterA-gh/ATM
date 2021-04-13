public abstract class AccountTypes {
    private double inAccount;

    public double withdraw(double amount){
        inAccount -= amount;
        return inAccount;
    }

    public double deposit(double amount){
        inAccount += amount;
        return inAccount;
    }

    public double getInAccount() {
        return inAccount;
    }

    public void giveTransfer(String account, double amount){
    }

    //public void rec
}
