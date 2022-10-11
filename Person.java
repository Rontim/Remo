
public class Person {
    private String first_name;
    private String last_name;
    private String password;
    private int Age;
    private String UserName;
    private String About;
    private String Institution;
    Boolean working = false;
    private Boolean inSchool = false;

    public Boolean getInSchool() {
        return inSchool;
    }

    public void setInSchool(Boolean inSchool) {
        this.inSchool = inSchool;
    }

    public String getInstitution() {
        return Institution;
    }

    public void setInstitution(String institution) {
        Institution = institution;
    }

    public Boolean getWorking() {
        return working;
    }

    public void setWorking(Boolean working) {
        this.working = working;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }

    Location loc;

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setLocation(Location location) {
        this.loc = location;
    }

    public void setPassWord(String password) {
        this.password = password;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setUsername(String Username) {
        this.UserName = Username;
    }

    public String getFirstName() {
        return first_name;
    }

    public Location getLocation() {
        return loc;
    }

    public String getLastName() {
        return last_name;
    }

    public String getPassWord() {
        return password;
    }

    public Integer getAge() {
        return Age;
    }

    public String getUsername() {
        return UserName;
    }

    public void displayDetails() {
        System.out.println("~~~~~~~~" + UserName + "~~~~~~~~");
        System.out.println("=> " + first_name + " " + last_name);
        loc.displayLocation();
        System.out.println("=> " + getAbout());
        System.out.println("=> " + getInstitution());
        System.out.println("=> " + getInSchool());
        System.out.println("=> " + getWorking());
    }
}
