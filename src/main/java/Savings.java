public class Savings extends AccountTypes implements CheckBalance {

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


    public void printBalance(){
        System.out.println("Your balance is " + getInAccount());
    }
}

