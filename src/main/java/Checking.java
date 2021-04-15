public class Checking extends AccountTypes implements CheckBalance {

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
    public void giveTransfer(String account, double amount){
        if(account == "savings" && getInAccount() >= amount){
            inAccount -= amount;
            //Get Savings
        }else if(account == "investment" && getInAccount() >= amount){
            inAccount -= amount;
            //Get Investment
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount+" hase been transferred to "+account);
    }

    @Override
    public double getInAccount() {
        return inAccount;
    }

    public void printBalance(){
        System.out.println("Your balance is " + getInAccount());
    }
}



