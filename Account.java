import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Account {
    ArrayList<Person> persons = new ArrayList<>();
    Person p = new Person();
    HashMap<String, Person> pers = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Location location = new Location();

    public void createAccount(Person p) {
        persons.add(p);
    }

    public void deleteAccount(Person p) {
        persons.remove(p);
    }

    public void accountsList() {
        for (Person p : persons) {
            p.displayDetails();
        }
    }

    public void signIn() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                  Sign up                  ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">> Enter You First name:");
        p.setFirstName(scanner.nextLine());
        System.out.println(">> Enter You last name:");
        p.setLastName(scanner.nextLine());
        System.out.println(">> Set Your password:");
        p.setPassWord(scanner.nextLine());
        System.out.println(">> Enter You preffered Username:");
        p.setUsername(scanner.nextLine());
        System.out.println(">> Enter You Country and city:");
        location.setCountry(scanner.nextLine());
        location.setCity(scanner.nextLine());
        p.setLocation(location);
        System.out.println("********************************************");
        System.out.println("         Account created successfully       ");
        System.out.println("********************************************");
        System.out.println("Welcome to Remo ;)");
        p.displayDetails();
        createAccount(p);
    }

    public Boolean search(String usr) {
        Boolean found;
        if (usr.equals(p.getUsername())) {
            found = true;
        } else {
            found = false;
        }
        return found;
    }

    public Boolean login(String usr, String pass) {

        Boolean access;
        if (usr.equals(p.getUsername()) && pass.equals(p.getPassWord())) {
            access = true;

        } else {
            access = false;
        }
        return access;

    }

    public void viewAccount(String usr) {
        p.displayDetails();
        Boolean exec = true;
        System.out.println("What action would like to perfom on the account:");
        System.out.println("=> Edit");
        System.out.println("=> Delete account");
        System.out.println("***Enter edit or delete for respective action***");
        String action = scanner.nextLine();
        while (exec) {
            switch (action) {
                case "edit":
                    System.out.println("Enter the new information or reenter the old one if you dont wish to change:");
                    while (exec) {
                        System.out.println(">> Enter You New or Old First name:");
                        p.setFirstName(scanner.nextLine());
                        System.out.println(">> Enter You New or Old last name:");
                        p.setLastName(scanner.nextLine());
                        System.out.println(">> Set Your New or Old password:");
                        p.setPassWord(scanner.nextLine());
                        System.out.println(">> Enter You new preffered or Username:");
                        p.setUsername(scanner.nextLine());
                        System.out.println(">> Enter You new or old Country and city:");
                        location.setCountry(scanner.nextLine());
                        location.setCity(scanner.nextLine());
                        p.setLocation(location);
                        System.out.println("Would you wish to add the following");
                        System.out.println("=> About");
                        System.out.println("=> Institution or company or corporation");
                        System.out.println("=> Working");
                        System.out.println("=> Are you in school");
                        System.out.println("***Enter about or inst or work or school for respective action***");
                        action = scanner.nextLine();

                        while (exec) {
                            switch (action) {
                                case "about":
                                    System.out.println("Write something that tells others about " + p.getFirstName());
                                    p.setAbout(scanner.nextLine());
                                    break;
                                case "inst":
                                    System.out.println(
                                            "Lets tell others where you work or where you are getting your education");
                                    p.setInstitution(scanner.nextLine());
                                    break;
                                case "work":
                                    System.out.println("Are you currently working if so enter yes to change");
                                    String status = scanner.nextLine();
                                    if (status.equals("yes") || status.equals("Yes")) {
                                        p.setWorking(true);
                                    }
                                    break;
                                case "school":
                                    System.out.println("Are you currently school if so enter yes to change");
                                    String state = scanner.nextLine();
                                    if (state.equals("yes") || state.equals("Yes")) {
                                        p.setInSchool(true);
                                    }
                                    break;
                                default:
                                    exec = false;
                            }

                            System.out.println("You are done with your update");
                            p.displayDetails();
                            persons.add(p);
                            exec = false;
                        }

                    }
                    break;
                case "delete":
                    System.out.println("Are you sure you want to delete this account: Y/n");
                    String choice = scanner.nextLine();
                    while (true) {
                        if (choice.equals("Y") || choice.equals("y")) {
                            deleteAccount(p);
                            System.out.println("********************************************");
                            System.out.println("         Account deleted successfully       ");
                            System.out.println("********************************************");
                            break;
                        }
                        if (choice.equals("N") || choice.equals("y")) {
                            break;
                        } else {
                            System.out.println("!!!Invalid choice!!!");
                            System.out.println("Enter Y or N");
                            choice = scanner.nextLine();
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
