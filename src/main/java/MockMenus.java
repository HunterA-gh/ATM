public class MockMenus {


    public static void checkingAccountMenu(){
        System.out.println("Welcome to your Checking account: " + "What would you like to do? ");
        System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
        System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
        System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
        System.out.printf("%5s-%5s\n", "[4] ", "Check Balance & Statements");
        System.out.printf("%5s-%5s\n", "[5] ", "Go back to Main Menu");
        System.out.print(": ");
        int inputOnCheckingAccountMenu = atmScanner.nextInt();
            switch (inputOnCheckingAccountMenu){
                case 1: {
                    //withdraw()
                    break;
                }
                case 2: {
                    //deposit()
                    break;
                }
                case 3:{
                    //giveTransfer()
                    break;
                }
                case 4:{
                    //getInAccount()
                    break;
                }
                case 5:{
                    bootUpATM();
                    break;
                }
            }

    }

    public static void savingsAccountMenu(){
        System.out.println("Welcome to your Savings account: " + "What do you want to do?");
        System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
        System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
        System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
        System.out.printf("%5s-%5s\n", "[4] ", "Check Balance & Statements");
        System.out.printf("%5s-%5s\n", "[5] ", "Go Back");
        System.out.print(": ");
        int inputOnCheckingAccountMenu = atmScanner.nextInt();
        switch (inputOnCheckingAccountMenu){
            case 1: {
                //withdraw()
                break;
            }
            case 2: {
                //deposit()
                break;
            }
            case 3:{
                //giveTransfer()
                break;
            }
            case 4:{
                ///getInAccount()
                break;
            }
            case 5:{
                bootUpATM();
                break;

            }
        }
    }

    public static void investmentsAccountMenu(){
        System.out.println("Welcome to our Investments account: ");
        System.out.println("Welcome to your Savings account: " + "What do you want to do?");
        System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
        System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
        System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
        System.out.printf("%5s-%5s\n", "[4] ", "Check Balance & Statements");
        System.out.printf("%5s-%5s\n", "[5] ", "Go Back");
        System.out.print(": ");
        int inputOnCheckingAccountMenu = atmScanner.nextInt();
        switch (inputOnCheckingAccountMenu){
            case 1: {
                //withdraw()
                break;
            }
            case 2: {
                //deposit()
                break;
            }
            case 3:{
                //giveTransfer()
                break;
            }
            case 4:{
                ///getInAccount()
                break;
            }
            case 5:{
                bootUpATM();
                break;
            }
        }

    }

}
