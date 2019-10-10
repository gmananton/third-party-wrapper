package com.gman;

import thirdparty.address.CityAddress;
import thirdparty.address.SuburbAddress;
import thirdparty.house.ApartmentHouse;
import thirdparty.house.PrivateHouse;
import thirdparty.person.ApartmentResident;
import thirdparty.person.PrivateHouseResident;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 */
public class Provider {

    public static List<ApartmentHouse> getApartments() {

        CityAddress newYorkAddress1 = new CityAddress("5th Avenue", 1, 1);
        List<ApartmentResident> newYorkers1 = Arrays.asList(
                new ApartmentResident("John"),
                new ApartmentResident("Mike"));
        ApartmentHouse aparts1 = new ApartmentHouse(newYorkAddress1, newYorkers1);

        CityAddress newYorkAddress2 = new CityAddress("Times Square", 2, 2);
        List<ApartmentResident> newYorkers2 = Arrays.asList(
                new ApartmentResident("Tom"),
                new ApartmentResident("Jane"),
                new ApartmentResident("Kate"));
        ApartmentHouse aparts2 = new ApartmentHouse(newYorkAddress2, newYorkers2);

        return Arrays.asList(aparts1, aparts2);
    }

    public static List<PrivateHouse> getHouses() {

        SuburbAddress subAddr1 = new SuburbAddress("New Jersey", "Street1", 1);
        List<PrivateHouseResident> newJerseyResidents = Arrays.asList(
                new PrivateHouseResident("Jack"),
                new PrivateHouseResident("Martha"));
        PrivateHouse house1 = new PrivateHouse(subAddr1, newJerseyResidents);


        SuburbAddress subAddr2 = new SuburbAddress("Long Island", "Street2", 2);
        List<PrivateHouseResident> longIslandResidents = Arrays.asList(
                new PrivateHouseResident("Robert"));
        PrivateHouse house2 = new PrivateHouse(subAddr2, longIslandResidents);

        return Arrays.asList(house1, house2);
    }

}
