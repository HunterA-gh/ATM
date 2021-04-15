
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserFunctions {

    static Scanner scanner = new Scanner(System.in);
    //private static Map<String, String> users = new HashMap<>();
    private static ArrayList<User> userArrayList = new ArrayList<>();

    public static void logIntoExistingUserProfile() {
        int passwordAttempts = 0;
        System.out.println("Please enter your Username : ");
        String confirmUsername = scanner.nextLine();
        for (User x : userArrayList) {
            if (x.getUsername().equals(confirmUsername)) {
                int currentUser = userArrayList.indexOf(x);
                System.out.println("Welcome back " + x.getUsername() + "\n" + "Please enter your password :");
                String userPassword = scanner.nextLine();
                if (userPassword.equals(x.getPassword())) {
                    System.out.println("You are now logged into your account");
                    Console.afterLogIntoExistingUserProfile();
                }
                else if (!(x.getPassword().equals(userPassword))) {
                    System.out.println("Sorry password does not match. Please try again");
                    while (passwordAttempts < 3) {
                        if ((!userPassword.equals(x.getPassword()))) {
                            System.out.println("Sorry passwords do not match. Try again.");
                            passwordAttempts++;
                            userPassword = scanner.nextLine();
                            } else {
                                System.out.println("good job bro that's your password");
                                Console.afterLogIntoExistingUserProfile();
                                break;
                        }
                    }
                }
            }
        }
    }

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

        while (count < 1) {

            if ((!confirmPass.equals(password))) {
                System.out.println("Sorry passwords do not match. Try again.");
                confirmPass = scanner.nextLine();
            } else {
                System.out.println("Congrats you've successfully made a new Account.");
                User user = new User(username, password);
                userArrayList.add(user);
                count++;
                break;
            }

        }

    }

    public static Savings makeAccountSavingsAccount(User user) {
        if (userArrayList.contains(user)) {
                System.out.println("How much do you want to deposit into account?: ");
                Scanner userInput = new Scanner(System.in);
                double initialDeposit = userInput.nextDouble();
                Savings savings = new Savings(initialDeposit);
            }else System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            return new Savings(initialDeposit);
        }

//    public static Investment makeAccountInvestmentAccount(){
//        for (int i = 0; i> UserFunctions.users.size(); i++){
//            if (UserFunctions..containsKey(users)){
//                System.out.println("How much do you want to deposit into account?: ");
//                Scanner userInput = new Scanner(System.in);
//                double initialDeposit = userInput.nextDouble();
//                return new Investment(initialDeposit);
//            }else System.out.println("How much do you want to deposit into account?: ");
//            Scanner userInput = new Scanner(System.in);
//            double initialDeposit = userInput.nextDouble();
//            return new Investment(initialDeposit);
//
//        }return null;
    public static Checking makeAccountCheckingAccount() {
        System.out.println("Please enter your username");
        String theSpecificUsername = scanner.nextLine();
        if (theSpecificUsername.equals(userArrayList.contains(theSpecificUsername))) {
            userArrayList.get(userArrayList.indexOf(userArrayList.contains(theSpecificUsername)));
            System.out.println("How much do you want to deposit into account?: ");
            Scanner userInput = new Scanner(System.in);
            double initialDeposit = userInput.nextDouble();
            Checking checking = new Checking(initialDeposit);
            return checking;

        } else System.out.println("How much do you want to deposit into account?: ");
        Scanner userInput = new Scanner(System.in);
        double initialDeposit = userInput.nextDouble();
        Checking checking = new Checking(initialDeposit);
        return checking;
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

