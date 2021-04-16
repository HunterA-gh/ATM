import java.util.ArrayList;
import java.util.Scanner;


public class Console {
    static Scanner atmScanner = new Scanner(System.in);
    static ArrayList<User> UsersArrayList = UserFunctions.getUserArrayList();

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
            afterCreateNewUserProfileResetScreen();
        }
    }

    public static void afterCreateNewUserProfileResetScreen() {
        bootUpATM();
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
                UserFunctions.makeCheckingAccountForUserProfile();
                checkingAccountMenu();
                return;
            }
            case 2: {

                UserFunctions.makeSavingsAccountForUserProfile();
                savingsAccountMenu();
                break;
            }
            case 3: {
                UserFunctions.makeInvestmentAccountForUserProfile();
                investmentAccountMenu();
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
                investmentAccountMenu();
                break;
            }
            case 7: {
                UserFunctions.deleteUserAccount();
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
        System.out.println("Please enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String thisPassword = scanner.nextLine();
        for (int i = 0; i < UsersArrayList.size(); i++) {
            if (UsersArrayList.get(i).getPassword().equals(thisPassword)) {
                System.out.println("Welcome to your Checking account: " + "What do you want to do?");
                System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
                System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
                System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
                System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
                System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
                System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
                System.out.printf("%5s-%5s\n", "[7] ", "Close this account");
                System.out.print(": ");
                int inputOnCheckingAccountMenu = atmScanner.nextInt();
                switch (inputOnCheckingAccountMenu) {
                    case 1: {
                        System.out.println("Enter amount to withdraw:");
                        UsersArrayList.get(i).getChecking().withdraw(atmScanner.nextDouble());
                        checkingAccountMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to deposit:");
                        UsersArrayList.get(i).getChecking().deposit(atmScanner.nextDouble());
                        checkingAccountMenu();
                        break;
                    }
                    case 3: {
                        UsersArrayList.get(i).transferFromChecking();
                        checkingAccountMenu();
                        break;
                    }
                    case 4: {
                        UsersArrayList.get(i).getChecking().getTransactionHistory();
                        checkingAccountMenu();
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
                    case 7: {
                        UserFunctions.deleteCheckingAccount();
                        break;
                    }
                }
            }
        }
    }

    public static void savingsAccountMenu() {
        System.out.println("Please enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String thisPassword = scanner.next();
        for (int i = 0; i < UsersArrayList.size(); i++) {
            if (UsersArrayList.get(i).getPassword().equals(thisPassword)) {
                System.out.println("Welcome to your Savings account: " + "What do you want to do?");
                System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
                System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
                System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
                System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
                System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
                System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
                System.out.printf("%5s-%5s\n", "[7] ", "Close this account");
                System.out.print(": ");
                int inputOnSavingsAccountMenu = atmScanner.nextInt();
                switch (inputOnSavingsAccountMenu) {
                    case 1: {
                        System.out.println("Enter amount to withdraw:");
                        UsersArrayList.get(i).getSavings().withdraw(atmScanner.nextDouble());
                        savingsAccountMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to deposit:");
                        UsersArrayList.get(i).getSavings().deposit(atmScanner.nextDouble());
                        savingsAccountMenu();
                        break;
                    }
                    case 3: {
                        UsersArrayList.get(i).transferFromSavings();
                        savingsAccountMenu();
                        break;
                    }
                    case 4: {
                        UsersArrayList.get(i).getSavings().getTransactionHistory();
                        savingsAccountMenu();
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
                    case 7: {
                        UserFunctions.deleteSavingsAccount();
                        break;
                    }
                }
            }
        }
    }

    public static void investmentAccountMenu() {
        System.out.println("Please enter your password : ");
        Scanner scanner = new Scanner(System.in);
        String thisPassword = scanner.next();
        for (int i = 0; i < UsersArrayList.size(); i++) {
            if (UsersArrayList.get(i).getPassword().equals(thisPassword)) {
                System.out.println("Welcome to your Investment account: " + "What do you want to do?");
                System.out.printf("%5s-%5s\n", "[1] ", "Withdraw");
                System.out.printf("%5s-%5s\n", "[2] ", "Deposit");
                System.out.printf("%5s-%5s\n", "[3] ", "Transfer");
                System.out.printf("%5s-%5s\n", "[4] ", "Print Transaction History");
                System.out.printf("%5s-%5s\n", "[5] ", "Return to Previous Screen");
                System.out.printf("%5s-%5s\n", "[6] ", "Return to Main Menu");
                System.out.printf("%5s-%5s\n", "[7] ", "Close this account");
                System.out.print(": ");
                int inputOnInvestmentAccountMenu = atmScanner.nextInt();
                switch (inputOnInvestmentAccountMenu) {
                    case 1: {
                        System.out.println("Enter amount to withdraw:");
                        UsersArrayList.get(i).getInvestment().withdraw(atmScanner.nextDouble());
                        investmentAccountMenu();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to deposit:");
                        UsersArrayList.get(i).getInvestment().deposit(atmScanner.nextDouble());
                        investmentAccountMenu();
                        break;
                    }
                    case 3: {
                        UsersArrayList.get(i).transferFromInvestment();
                        investmentAccountMenu();
                        break;
                    }
                    case 4: {
                        UsersArrayList.get(i).getInvestment().getTransactionHistory();
                        investmentAccountMenu();
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
                    case 7: {
                        UserFunctions.deleteInvestmentAccount();
                    }
                }
            }
        }
    }
}
