import java.util.Scanner;

public class Home {
    Person p = new Person();
    Account acc = new Account();

    Scanner scanner = new Scanner(System.in);
    Friends friends = new Friends();

    public void homePage(String usr) {
        System.out.println("===========================================");
        System.out.println("                  @" + p.getUsername());
        System.out.println("===========================================");
        System.out.println("\n");
        System.out.println("What would you like to do:");
        System.out.println(">> View friends");
        System.out.println(">> Add friends");
        System.out.println(">> remove friend");
        System.out.println(">> View Account");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter; View, Add, Remove, account to do respective function.....");
        String option = scanner.nextLine();
        boolean exec = true;
        while (exec) {
            switch (option) {
                case "View":
                    System.out.println("===========================================");
                    System.out.println("                  My Friends               ");
                    System.out.println("===========================================");
                    friends.diplayFriends();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    exec = false;
                case "Add":
                    friends.searchFriends();
                    break;
                case "remove":
                    friends.remove();
                    break;
                case "account":
                    acc.viewAccount(usr);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("                  Remo                     ");
        System.out.println("===========================================");
        System.out.println("                                           ");
        System.out.println("             * * ****   * *                ");
        System.out.println("             *   *    *   *                ");
        System.out.println("             *   *  **    *                ");
        System.out.println("             *   *   *    *                ");
        System.out.println("             *   *    *   *                ");
        System.out.println("                                           ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        try (Scanner scanner = new Scanner(System.in)) {
            Home h = new Home();
            Account account = new Account();

            while (true) {
                System.out.println("\n");
                System.out.println("                  Home page                  ");
                System.out.println("Menu   ");
                System.out.println(">> Login");
                System.out.println(">> Sign up");
                System.out.println("# Enter option below");
                String choice = scanner.nextLine();
                System.out.println("\n");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                if (choice.equals("login") || choice.equals("Login")) {
                    System.out.println("                  Login page                  ");
                    System.out.println(">> Enter your username below");
                    String username = scanner.nextLine();
                    System.out.println(">> Enter password below");
                    String pass = scanner.nextLine();
                    account.login(username, pass);
                    if (account.login(username, pass).equals(true)) {
                        h.homePage(username);
                    } else {
                        System.out.println("\n");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("!!!You dont have an account");
                        System.out.println("Would you wish to create one(Y/n)");
                        choice = scanner.nextLine();
                        while (true) {
                            if (choice.equals("Y") || choice.equals("y")) {
                                account.signIn();
                                break;
                            }
                            if (choice.equals("N") || choice.equals("n")) {
                                break;
                            } else {
                                System.out.println("!!!Invalid choice!!!");
                                System.out.println("Enter Y or N");
                                choice = scanner.nextLine();
                            }
                        }

                    }
                }
                if (choice.equals("Sign up") || choice.equals("sign up")) {
                    account.signIn();
                }
            }
        }

    }
}
