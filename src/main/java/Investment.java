public class Investment extends AccountTypes{
    private double inAccount;

    @Override
    public double withdraw(double amount){
        inAccount -= amount;
        return inAccount;
    }

    @Override
    public double deposit(double amount){
        inAccount += amount;
        return inAccount;
    }

    @Override
    public double getInAccount() {
        return inAccount;
    }
}
