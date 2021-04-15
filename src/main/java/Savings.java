public class Savings extends AccountTypes {

    public Savings(double inAccount) {
        super(inAccount);
    }

    public void giveTransfer(int account, double amount) {
        if(account == 1 && getInAccount() >= amount){
            //Get Checking
        }else if(account == 3 && getInAccount() >= amount){
            //Get Investment
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount+" hase been transferred to "+account);
    }


}

