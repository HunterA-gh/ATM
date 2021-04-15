public class Checking extends AccountTypes {

    public Checking(double balance){
        super(balance);
    }

    public void giveTransfer(int account, double amount){
        if (account == 2 && getInAccount() >= amount){
            //Get Savings
        }else if (account == 3 && getInAccount() >= amount) {
            //Get Investment
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount + " hase been transferred to " + account);
    }
}