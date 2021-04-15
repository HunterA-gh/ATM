
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserFunctions {

    static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> usersWithAccounts = new HashMap<>();

    public static void logIntoExistingAccount() {
        System.out.println("Please enter your Username : ");
        String confirmUsername = scanner.nextLine();
        if (usersWithAccounts.containsKey(confirmUsername)) {
            System.out.println("Hello " + confirmUsername);
            System.out.println("Please enter your password : ");
            String checkAccountPassword = scanner.nextLine();
            if (usersWithAccounts.get(confirmUsername) != null && usersWithAccounts.get(confirmUsername).contains(checkAccountPassword)) {
                System.out.println("Welcome back to your account");
            } else if (!(usersWithAccounts.containsKey(confirmUsername))) {
                System.out.println("Sorry no user exists with this username");
            } else if (!(usersWithAccounts.get(confirmUsername).contains(checkAccountPassword))) {
                System.out.println("Sorry that password is incorrect");
            }
        }
    }
//        System.out.println("Username: " + username);
//        if (username.equals(usersWithAccounts.contains(username))) {
//            System.out.println("Please enter your password: ");
//        } else if (username.equals(usersWithAccounts.contains(username) == false)){
//            System.out.println("error");
//            }
//        String password = scanner.nextLine();
//            if (password.equals(usersWithAccounts.contains(password)))
//            {
//                System.out.println("Welcome back " + username + ". What would you like to do?");
//            }
//            else {
//                System.out.println("error.");
//            }
//        }


    public static void createNewAccount() {
        System.out.println("Please create a Username");
        String username = scanner.nextLine();
        //System.out.println("Your username is : " + username);

        System.out.println("Please create a new password: ");
        String password = scanner.nextLine();
        System.out.println("Password: " + password);
        System.out.println("Please re-enter your new password to confirm.");
        String confirmPass = scanner.nextLine();

        int count = 0;

//create while loop, set loop continuation condition to count < 3
        while (count < 1) {

            if ((!confirmPass.equals(password))) {
                System.out.println("Sorry passwords do not match. Try again.");
                confirmPass = scanner.nextLine();
            } else {
                System.out.println("Congrats you've successfully made a new Account.");
                Users users = new Users(username, password);
                usersWithAccounts.put(username, password);
                count++;
                break;
            }
        }
    }
}
//        if (password.equals(confirmPass)) {
//            System.out.println("Thank you for confirming. Your new Password: " + confirmPass);
//        } else {
//            while (password.equals(confirmPass) == false) {
//
//            }
//            System.out.println("Error. Passwords do not match. Please try again.");
//            // call the method to put in a password again
//        }
