import java.util.Scanner;


public class Console {
    static Scanner atmScanner = new Scanner(System.in);

    public static void main(String[] args) {

        bootUpLogo();
        bootUpATM();
    }

    public static void bootUpATM() {
        System.out.println("What do you want to do?");
        System.out.printf("%5s-%5s\n", "[1] ", " Log in to existing account.");
        System.out.printf("%5s-%5s\n", "[2] ", " Create a new account.");
        System.out.print(": ");
        int inputOnHomeScreen = atmScanner.nextInt();
        if (inputOnHomeScreen == 1) {
            UserFunctions.logIntoExistingUserProfile();
        }
        if (inputOnHomeScreen == 2) {
            UserFunctions.createNewUserProfile();
            afterCreateNewUserProfile();
        }
    }

    public static void afterCreateNewUserProfile() {
        // after creating a new account on the bootUpATM
        // this will be the menu the user can interact with
        bootUpATM();
//        int inputOnNewAccountUserScreen = atmScanner.nextInt();
//        switch (inputOnNewAccountUserScreen) {
//            case 1: {
//                UserFunctions.makeAccountCheckingAccount();
//                break;
//            }
//            case 2: {
//                UserFunctions.makeAccountSavingsAccount();
//                break;
//            }
//            case 3: {
//                UserFunctions.makeAccountInvestmentAccount();
//                break;
//            }
//            case 4: {
//                bootUpATM();
//                break;
//            }
    }


    public static void afterLogIntoExistingUserProfile() {
        // after logging into an existing account
        // this will be the menu the user can interact with
        System.out.println("What would you like to do?");
        System.out.printf("%5s-%5s\n", "[1] ", " Create a new Checking account.");
        System.out.printf("%5s-%5s\n", "[2] ", " Create a new Savings account.");
        System.out.printf("%5s-%5s\n", "[3] ", " Create a new Investment account.");
        System.out.printf("%5s-%5s\n", "[4] ", " Log into your existing Checking account.");
        System.out.printf("%5s-%5s\n", "[5] ", " Log into your existing Savings account.");
        System.out.printf("%5s-%5s\n", "[6] ", " Log into your existing Investment account.");
        System.out.printf("%5s-%5s\n", "[7] ", " Close this account.");
        System.out.printf("%5s-%5s\n", "[8] ", " Return to Main Menu");
        int inputOnAfterLogIntoAccountScreen = atmScanner.nextInt();
        switch (inputOnAfterLogIntoAccountScreen) {
            case 1: {
                UserFunctions.makeAccountCheckingAccount();
                checkingAccountMenu();
                return;
            }
            case 2: {

                //UserFunctions.makeAccountSavingsAccount();
                savingsAccountMenu();
                break;
            }
            case 3: {
                //UserFunctions.makeAccountInvestmentAccount();
                investmentsAccountMenu();
                break;
            }
            case 4: {
                checkingAccountMenu();
                break;
            }
            case 5: {
                savingsAccountMenu();
                break;
            }
            case 6: {
                investmentsAccountMenu();
                break;
            }
            case 7: {
                //closeAccount();
                break;
            }
            case 8: {
                bootUpATM();
                break;
            }
        }


    }

    public static void bootUpLogo() {
        System.out.println("\n" +
                "                                                                                 \n" +
                "                                                                                 \n" +
                "               AAA         TTTTTTTTTTTTTTTTTTTTTTTMMMMMMMM               MMMMMMMM\n" +
                "              A:::A        T:::::::::::::::::::::TM:::::::M             M:::::::M\n" +
                "             A:::::A       T:::::::::::::::::::::TM::::::::M           M::::::::M\n" +
                "            A:::::::A      T:::::TT:::::::TT:::::TM:::::::::M         M:::::::::M\n" +
                "           A:::::::::A     TTTTTT  T:::::T  TTTTTTM::::::::::M       M::::::::::M\n" +
                "          A:::::A:::::A            T:::::T        M:::::::::::M     M:::::::::::M\n" +
                "         A:::::A A:::::A           T:::::T        M:::::::M::::M   M::::M:::::::M\n" +
                "        A:::::A   A:::::A          T:::::T        M::::::M M::::M M::::M M::::::M\n" +
                "       A:::::A     A:::::A         T:::::T        M::::::M  M::::M::::M  M::::::M\n" +
                "      A:::::AAAAAAAAA:::::A        T:::::T        M::::::M   M:::::::M   M::::::M\n" +
                "     A:::::::::::::::::::::A       T:::::T        M::::::M    M:::::M    M::::::M\n" +
                "    A:::::AAAAAAAAAAAAA:::::A      T:::::T        M::::::M     MMMMM     M::::::M\n" +
                "   A:::::A             A:::::A   TT:::::::TT      M::::::M               M::::::M\n" +
                "  A:::::A               A:::::A  T:::::::::T      M::::::M               M::::::M\n" +
                " A:::::A                 A:::::A T:::::::::T      M::::::M               M::::::M\n" +
                "AAAAAAA                   AAAAAAATTTTTTTTTTT      MMMMMMMM               MMMMMMMM\n" +
                "                                                                                 \n" +
                "                                                                                 \n");
    }


    public static double twoDecimalPlaces(double moveTwoDecimalPlace) {
        return Math.floor(moveTwoDecimalPlace * 100) / 100;
    }

    public static void checkingAccountMenu() {
        System.out.println("Welcome to your Checking account: " + "What would you like to do? ");
        System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
        System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
        System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
        System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
        System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
        System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
        System.out.print(": ");
        int inputOnCheckingAccountMenu = atmScanner.nextInt();
        switch (inputOnCheckingAccountMenu) {
            case 1: {
                //withdraw()
                break;
            }
            case 2: {
                //deposit()
                break;
            }
            case 3: {
                //giveTransfer()
                break;
            }
            case 4: {
                //getInAccount()
                break;
            }
            case 5: {
                afterLogIntoExistingUserProfile();
                break;
            }
            case 6: {
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
        System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
        System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
        System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
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
                afterLogIntoExistingUserProfile();
                break;
            }
            case 6: {
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
        System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
        System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
        System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
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
                afterLogIntoExistingUserProfile();
                break;
            }
            case 6:{
                bootUpATM();
                break;
            }
        }

    }

}
