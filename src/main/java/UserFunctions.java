
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserFunctions {

    static Scanner scanner = new Scanner(System.in);
    private static Map<String, String> users = new HashMap<>();
    private static ArrayList<User> userArrayList = new ArrayList<>();

    public static void logIntoExistingUserProfile() {
        System.out.println("Please enter your Username : ");
        String confirmUsername = scanner.nextLine();
        if (users.containsKey(confirmUsername)) {
            System.out.println("Hello " + confirmUsername);
            System.out.println("Please enter your password : ");
            String checkAccountPassword = scanner.nextLine();
            if (users.get(confirmUsername).contains(checkAccountPassword)) {
                System.out.println("Welcome back to your account");
                Console.afterLogIntoExistingUserProfile();

            } else if (!(users.get(confirmUsername).contains(confirmUsername))) {
                System.out.println("Sorry username or password is incorrect");
                //System.exit(0);
            }
        } //return;
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


    public static void createNewUserProfile() {
        System.out.println("Please create a Username");
        String username = scanner.nextLine();
        //System.out.println("Your username is : " + username);

        System.out.println("Please create a new password: ");
        String password = scanner.nextLine();
        System.out.println("Your Password is : " + password);
        System.out.println("Please re-enter your new password to confirm : ");
        String confirmPass = scanner.nextLine();

        int count = 0;

//create while loop, set loop continuation condition to count < 3
        while (count < 1) {

            if ((!confirmPass.equals(password))) {
                System.out.println("Sorry passwords do not match. Try again.");
                confirmPass = scanner.nextLine();
            } else {
                System.out.println("Congrats you've successfully made a new Account.");
                User user = new User(username, password);
                userArrayList.add(user);
                UserFunctions.users.put(username, password);
                count++;
                break;
            }

        }

    }

    public static Savings makeAccountSavingsAccount() {
        for (int i = 0; i> UserFunctions.users.size(); i++){
            if (UserFunctions.users.containsKey(users)){
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                return new Savings(initialDeposit);
            }else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            return new Savings(initialDeposit);

        }return null;
    }

    public static Investment makeAccountInvestmentAccount(){
        for (int i = 0; i> UserFunctions.users.size(); i++){
            if (UserFunctions.users.containsKey(users)){
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                return new Investment(initialDeposit);
            }else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            return new Investment(initialDeposit);

        }return null;
    }
    public static Checking makeAccountCheckingAccount() {
        for (int i = 0; i < UserFunctions.userArrayList.size(); i++) {

            if (UserFunctions.users.containsKey(users)) {
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                Checking checking = new Checking(initialDeposit);
                return checking;

            } else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            Checking checking = new Checking(initialDeposit);
            System.out.println(checking.getInAccount());
        }return null;
    }


    public static Map<String, String> getUsers() {
        return users;
    }

    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}


//public static Investment makeAccountInvestmentAccount(Users newUser,){
//    System.out.println("How much do you want to deposit?");
//            Scanner userInput = new Scanner(System.in);
//
//}


//        if (password.equals(confirmPass)) {
//            System.out.println("Thank you for confirming. Your new Password: " + confirmPass);
//        } else {
//            while (password.equals(confirmPass) == false) {
//
//            }
//            System.out.println("Error. Passwords do not match. Please try again.");
//            // call the method to put in a password again
//        }
