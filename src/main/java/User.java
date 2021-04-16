import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private Investment investment;
    private Savings savings;
    private Checking checking;


    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }

    public Checking getChecking() {
        return checking;
    }

    public void setChecking(Checking checking) {
        this.checking = checking;
    }

    public void transferFromChecking() {
        System.out.println("Enter number to transfer to");
        System.out.printf("%5s-%5s\n", "[1] ", "Savings");
        System.out.printf("%5s-%5s\n", "[2] ", "Investment");
        Scanner transferScan = new Scanner(System.in);
        int choice = transferScan.nextInt();
        System.out.println("Enter amount to transfer");
        double amount = transferScan.nextDouble();
        switch(choice){
            case 1:
                System.out.println("Enter Password");
                String passwd = transferScan.nextLine();
                for(int i=0;i<UserFunctions.getUserArrayList().size();i++){
                    if (UserFunctions.getUserArrayList().get(i).getPassword() == passwd){
                        Savings newSavings = new Savings(0);
                        UserFunctions.getUserArrayList().get(i).setSavings(newSavings);
                        UserFunctions.getUserArrayList().get(i).getChecking().withdraw(amount);
                        UserFunctions.getUserArrayList().get(i).getSavings().deposit(amount);
                    }

                }Console.checkingAccountMenu();


            case 2:
                this.checking.withdraw(amount);
                this.investment.deposit(amount);
            default:
                System.out.println("Invalid account type");
        }
        System.out.println(amount+" transferred");
    }


}

