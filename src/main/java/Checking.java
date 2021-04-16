
public class Checking extends AccountTypes {

    public Checking(double inAccount) {
        super(inAccount);
    }

    @Override
    public void giveTransfer(int account, double amount) {
        if (account == 2 && getBalance() >= amount) {


    /*
    @Override
    public void giveTransfer(String account, double amount){
        if(account == "savings" && getInAccount() >= amount){
            inAccount -= amount;
            //Get Savings
        }else if(account == 3 && getInAccount() >= amount){
            //Get Investment
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount+" hase been transferred to "+account);
    }

     */
        }

    }
    public void printBalance() {

    }
}
