public class Location {
    private String Country;
    private String City;

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setCity(String City) {

        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public void displayLocation() {
        System.out.println("=> " + getCountry());
        System.out.println("=> " + getCity());
    }
}
