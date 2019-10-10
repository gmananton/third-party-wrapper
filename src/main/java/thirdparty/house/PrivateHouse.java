package thirdparty.house;

import thirdparty.address.SuburbAddress;
import thirdparty.person.PrivateHouseResident;

import java.util.List;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 */
public class PrivateHouse {

    private SuburbAddress address;
    private List<PrivateHouseResident> residents;

    public PrivateHouse() {
    }

    public PrivateHouse(SuburbAddress address, List<PrivateHouseResident> residents) {
        this.address = address;
        this.residents = residents;
    }

    public SuburbAddress getAddress() {
        return address;
    }

    public void setAddress(SuburbAddress address) {
        this.address = address;
    }

    public List<PrivateHouseResident> getResidents() {
        return residents;
    }

    public void setResidents(List<PrivateHouseResident> residents) {
        this.residents = residents;
    }
}
