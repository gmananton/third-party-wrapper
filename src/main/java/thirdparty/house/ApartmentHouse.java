package thirdparty.house;

import thirdparty.address.CityAddress;
import thirdparty.person.ApartmentResident;

import java.util.List;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 */
public class ApartmentHouse {

    private CityAddress address;
    private List<ApartmentResident> residents;

    public ApartmentHouse() {
    }

    public ApartmentHouse(CityAddress address, List<ApartmentResident> residents) {
        this.address = address;
        this.residents = residents;
    }

    public CityAddress getAddress() {
        return address;
    }

    public void setAddress(CityAddress address) {
        this.address = address;
    }

    public List<ApartmentResident> getResidents() {
        return residents;
    }

    public void setResidents(List<ApartmentResident> residents) {
        this.residents = residents;
    }
}
