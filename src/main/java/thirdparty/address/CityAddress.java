package thirdparty.address;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 */
public class CityAddress {

    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public CityAddress(String street, int houseNumber, int apartmentNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public CityAddress() {
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

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
