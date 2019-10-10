package thirdparty.address;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 */
public class SuburbAddress {

    private String town;
    private String street;
    private int houseNumber;

    public SuburbAddress() {
    }

    public SuburbAddress(String town, String street, int houseNumber) {
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
