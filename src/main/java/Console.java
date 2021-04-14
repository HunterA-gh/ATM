import java.util.Scanner;


public class Console {
    static Scanner atmScanner = new Scanner(System.in);
    public static void main(String[] args) {


        bootUpATM();

    }

    public static void bootUpATM() {
        bootUpLogo();
        System.out.println("What do you want to do?");
        System.out.printf("%5s-%5s\n", "[1] ", " Log in to existing account.");
        System.out.printf("%5s-%5s\n", "[2] ", " Create a new account.");
        System.out.print(": ");
        int inputOnHomeScreen = atmScanner.nextInt();
        if (inputOnHomeScreen == 1) {
            UserFunctions.logIntoExistingAccount();
        }
        if (inputOnHomeScreen == 2) {
            UserFunctions.createNewAccount();
            afterCreateNewAccountScreen();
        }   
    }

    public static void afterCreateNewAccountScreen() {
        // after creating a new account on the bootUpATM
        // this will be the menu the user can interact with
        System.out.println("Welcome to your new account." + "\n What would you like to do?");
        System.out.printf("%5s-%5s\n", "[1] ", " Create a new Checking account.");
        System.out.printf("%5s-%5s\n", "[2] ", " Create a new Savings account.");
        System.out.printf("%5s-%5s\n", "[3] ", " Create a new Investment account.");
        System.out.printf("%5s-%5s\n", "[4] ", " Return to Main Menu.");
        int inputOnNewAccountUserScreen = atmScanner.nextInt();
        switch (inputOnNewAccountUserScreen) {
            case 1: {
                //openNewCheckingAccount()
                break;
            }
            case 2: {
                //createnewsavingsaccount();
                break;
            }
            case 3: {
                //createnewinvetsmentaccount();
                break;
            }
            case 4: {
                bootUpATM();
            }
        }

        }

    public static void afterLogIntoExistingAccountScreen() {
        // after logging into an existing account
        // this will be the menu the user can interact with
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
}
