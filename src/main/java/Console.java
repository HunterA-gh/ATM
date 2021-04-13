import java.util.Scanner;


public class Console {
    public static void main(String[] args) {


        bootUpATM();

    }

    public static void bootUpATM() {
        System.out.println("What do you want to do?");
        System.out.printf("%5s-%5s\n", "1 ", " Log in to existing account.");
        System.out.printf("%5s-%5s\n", "2 ", " Create a new account.");
        System.out.print(": ");
        Scanner atmScanner = new Scanner(System.in);
        int inputOnHomeScreen = atmScanner.nextInt();
        if (inputOnHomeScreen == 1) {
            //logIntoExistingAccount();
        }
        if (inputOnHomeScreen == 2) {
            //createNewAccount();

            System.out.println("Caesar eats poop");
        }   
    }
}
