
import java.util.ArrayList;
import java.util.Scanner;

public class UserFunctions {

    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<User> userArrayList = new ArrayList<>();

    public static void logIntoExistingUserProfile() {
        int passwordAttempts = 0;
        System.out.println("Please enter your Username : ");
        String confirmUsername = scanner.next();
        for (User x : userArrayList) {
            if (x.getUsername().equals(confirmUsername)) {
                int currentUser = userArrayList.indexOf(x);
                System.out.println("Welcome back " + x.getUsername() + "\n" + "Please enter your password :");
                String userPassword = scanner.next();
                if (userPassword.equals(x.getPassword())) {
                    System.out.println("You are now logged into your account");
                    Console.afterLogIntoExistingUserProfile();
                } else if (!(x.getPassword().equals(userPassword))) {
                    System.out.println("Sorry password does not match. Please try again");
                    while (passwordAttempts < 3) {
                        if ((!userPassword.equals(x.getPassword()))) {
                            System.out.println("Sorry passwords do not match. Try again.");
                            passwordAttempts++;
                            userPassword = scanner.next();
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
        String username = scanner.next();
        //System.out.println("Your username is : " + username);

        System.out.println("Please create a new password: ");
        String password = scanner.next();
        System.out.println("Your Password is : " + password);
        System.out.println("Please re-enter your new password to confirm : ");
        String confirmPass = scanner.next();

        int count = 0;

        while (count < 1) {

            if ((!confirmPass.equals(password))) {
                System.out.println("Sorry passwords do not match. Try again.");
                confirmPass = scanner.next();
            } else {
                System.out.println("Congrats you've successfully made a new Account.");
                User user = new User(username, password);
                userArrayList.add(user);
                count++;
                break;
            }

        }

    }

    public static void makeSavingsAccountForUserProfile() {
        System.out.println("whats your password");
        String thisUsersPassword = scanner.next();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getPassword().equals(thisUsersPassword)) {
                System.out.println("Please enter an initial deposit amount");
                double initialDeposit = scanner.nextDouble();
                Savings savings = new Savings(0.0);
                userArrayList.get(i).setSavings(savings);
                savings.deposit(initialDeposit);
                userArrayList.get(i).getSavings().printBalance();
            }
        }
    }

    public static void makeInvestmentAccountForUserProfile() {
        System.out.println("whats your password");
        String thisUsersPassword = scanner.next();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getPassword().equals(thisUsersPassword)) {
                System.out.println("Please enter an initial deposit amount");
                double initialDeposit = scanner.nextDouble();
                Investment investment = new Investment(0.0);
                userArrayList.get(i).setInvestment(investment);
                investment.deposit(initialDeposit);
                userArrayList.get(i).getInvestment().printBalance();
            }
        }
    }

    public static void makeCheckingAccountForUserProfile() {
        System.out.println("whats your password");
        String thisUsersPassword = scanner.next();
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).getPassword().equals(thisUsersPassword)) {
                System.out.println("Please enter an initial deposit amount");
                double initialDeposit = scanner.nextDouble();
                Checking checking = new Checking(0.0);
                userArrayList.get(i).setChecking(checking);
                checking.deposit(initialDeposit);
                userArrayList.get(i).getChecking().printBalance();
            }
        }
    }


    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
    }


    public static void deleteUserAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete your account");
        System.out.printf("%5s-%5s\n", "[1] ", " Yes");
        System.out.printf("%5s-%5s\n", "[2] ", " No");
        int userInput = scanner.nextInt();
        // if no don't delete, go back to log into existing user profile
        if (userInput == 2) {
            Console.afterLogIntoExistingUserProfile();
        }
        if (userInput == 1) {
            System.out.println("What is your password");
            String password = scanner.next();
            // if password is right, remove
            for (User u : userArrayList) {
                if (password.equals(u.getPassword())) {
                    userArrayList.remove(u);
                    System.out.println("Account Deleted");
                    Console.afterLogIntoExistingUserProfile();
                    return;
                }
            }
        }
        String password = scanner.nextLine();
        for (User u : userArrayList) {
            while (password != u.getPassword()) {
                System.out.println("Sorry passwords do not match. Try2 again.");
                String password2 = scanner.nextLine();
                // password = scanner.nextLine();
                if (password2.equals(u.getPassword())) {
                    userArrayList.remove(u);
                    System.out.println("Your account has been deleted. Goodbye.");
                    Console.afterLogIntoExistingUserProfile();
                }
            }
        }
    }




    public static void deleteCheckingAccount () {
        System.out.println("Please enter your username");
        String theSpecificUsername = scanner.next();
        for (User u : userArrayList) {
            if (u.getUsername().equals(theSpecificUsername)) {
                if (u.getChecking().getBalance() != 0) {
                    System.out.println("Your account still has money in it. Please withdraw your remaining balance " + String.format("$%.2f", u.getChecking().getBalance()));
                    Console.checkingAccountMenu();
                }
                if (u.getChecking().getBalance() == 0) {
                    System.out.println("Are you sure you want to delete your account");
                    System.out.printf("%5s-%5s\n", "[1] ", " Yes");
                    System.out.printf("%5s-%5s\n", "[2] ", " No");
                    int userInput1 = scanner.nextInt();
                    if (userInput1 == 2) {
                        Console.afterLogIntoExistingUserProfile();
                    } else if (userInput1 == 1) {

                        u.setChecking(null);
                        System.out.println("Your account has been deleted.");
                        Console.afterLogIntoExistingUserProfile();

                    }

                }

            }


            }
        }








    public static void deleteInvestmentAccount () {
        System.out.println("Please enter your username");
        String theSpecificUsername = scanner.next();
        for (User u : userArrayList) {
            if (u.getUsername().equals(theSpecificUsername)) {
                if (u.getInvestment().getBalance() != 0) {
                    System.out.println("Your account still has money in it. Please withdraw your remaining balance " + String.format("$%.2f", u.getInvestment().getBalance()));
                    Console.investmentAccountMenu();
                }
                if (u.getInvestment().getBalance() == 0) {
                    System.out.println("Are you sure you want to delete your account");
                    System.out.printf("%5s-%5s\n", "[1] ", " Yes");
                    System.out.printf("%5s-%5s\n", "[2] ", " No");
                    int userInput = scanner.nextInt();
                    if (userInput == 2) {
                        Console.afterLogIntoExistingUserProfile();
                    } else if (userInput == 1) {
                        u.setInvestment(null);
                        System.out.println("Your account has been deleted.");
                        Console.afterLogIntoExistingUserProfile();

                    }

                }


            }
        }

    }



    public static void deleteSavingsAccount () {
        System.out.println("Please enter your username");
        String theSpecificUsername = scanner.next();
        for (User u : userArrayList) {
            if (u.getUsername().equals(theSpecificUsername)) {
                if (u.getSavings().getBalance() != 0) {
                    System.out.println("Your account still has money in it. Please withdraw your remaining balance " + String.format("$%.2f", u.getSavings().getBalance()));
                    Console.savingsAccountMenu();
                }
                if (u.getSavings().getBalance() == 0) {
                    System.out.println("Are you sure you want to delete your account");
                    System.out.printf("%5s-%5s\n", "[1] ", " Yes");
                    System.out.printf("%5s-%5s\n", "[2] ", " No");
                    int userInput = scanner.nextInt();
                    if (userInput == 2) {
                        Console.afterLogIntoExistingUserProfile();
                    } else if (userInput == 1) {
                                u.setSavings(null);
                                System.out.println("Your account has been deleted.");
                                Console.afterLogIntoExistingUserProfile();

                            }

                        }


                    }
                }

            }

        }











