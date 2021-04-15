public class Investment extends AccountTypes{

    public Investment(double balance){
        super(balance);
    }

    /*public void giveTransfer(int account, double amount){ //OLD METHOD
        if (account == 1 && getInAccount() >= amount){
            //Get Checking
        }else if (account == 2 && getInAccount() >= amount){
            //Get Savings
        }else{
            System.out.println("Invalid account");
        }
        System.out.println(amount + " hase been transferred to " + account);
    }*/

}
