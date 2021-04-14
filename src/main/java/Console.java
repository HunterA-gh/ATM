import java.util.Scanner;


public class Console {
    public static void main(String[] args) {


        bootUpATM();

    }

    public static void bootUpATM() {
        bootUpLogo();
        System.out.println("What do you want to do?");
        System.out.printf("%5s-%5s\n", "[1] ", " Log in to existing account.");
        System.out.printf("%5s-%5s\n", "[2] ", " Create a new account.");
        System.out.print(": ");
        Scanner atmScanner = new Scanner(System.in);
        int inputOnHomeScreen = atmScanner.nextInt();
        if (inputOnHomeScreen == 1) {
            Accounts.logIntoExistingAccount();
        }
        if (inputOnHomeScreen == 2) {
            Accounts.createNewAccount();

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
}
