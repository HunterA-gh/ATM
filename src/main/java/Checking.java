import java.util.ArrayList;

public class Checking extends AccountTypes {
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory = new ArrayList<String>();

    public Checking(double inAccount) {
        super(inAccount);
    }

    public void giveTransfer(int account, double amount) {
        if (account == 2 && getInAccount() >= amount) {


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


}