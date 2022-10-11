import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is a friends class
 * It has an Array list that stores friens frome the accounts array in account class if they exist
 * it has an addfriend method for adding a friend
 * A remove method to remove a friend and
 * A display method to display friends list by calling the display details method in Person class
*/
public class Friends {

    ArrayList<Person> Friends = new ArrayList<>();
    Account accounts = new Account();
    Person p = new Person();
    Scanner scanner = new Scanner(System.in);
    Location location = new Location();

    public void addFriend(Person f) {
        Friends.add(f);
    }

    public void removeFriend(Person p) {
        Friends.remove(p);
    }

    public void diplayFriends() {
        for (Person f : Friends) {
            f.displayDetails();
        }
    }

    public Boolean searchFriends(String usr) {
        Boolean found;
        if (usr.equals(p.getUsername())) {
            found = true;
        } else {
            found = false;
        }
        return found;
    }

    public void searchFriends() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        accounts.accountsList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("=> Enter friends user name:");
        String username = scanner.nextLine();
        accounts.search(username);
        if (accounts.search(username).equals(true)) {
            p.displayDetails();
            System.err.println(">> Do you wish to add this friend:(Y/n)");
            String choice = scanner.nextLine();
            while (true) {
                if (choice.equals("Y") || choice.equals("y")) {
                    addFriend(p);
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
        } else {
            System.out.println("!!!User not found!!!");
        }
    }

    public void remove() {
        System.out.println("=> Enter friends user name:");
        String username = scanner.nextLine();
        searchFriends(username);
        if (searchFriends(username).equals(true)) {
            p.displayDetails();
            System.err.println(">> Do you wish to add this friend:(Y/n)");
            String choice = scanner.nextLine();
            while (true) {
                if (choice.equals("Y") || choice.equals("y")) {
                    removeFriend(p);
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
        } else {
            System.out.println("!!!User not found!!!");
        }
    }
}
