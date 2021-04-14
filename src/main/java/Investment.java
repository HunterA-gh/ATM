public class Investment extends AccountTypes{

    public Investment(double inAccount) {
        super(inAccount);
    }

    public void giveTransfer(int account, double amount) {
        if(account == 1 && getInAccount() >= amount){
            //Get Savings
        }else if(account == 2 && getInAccount() >= amount){
            //Get Investment
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount+" hase been transferred to "+account);
    }

}
