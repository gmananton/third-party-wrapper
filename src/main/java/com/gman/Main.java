package com.gman;

import thirdparty.house.ApartmentHouse;
import thirdparty.house.PrivateHouse;
import thirdparty.person.ApartmentResident;
import thirdparty.person.PrivateHouseResident;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Anton Mikhaylov on 10.10.2019.
 * <p>
 * Есть:
 * - список городских адресов с квартирными домами и их жителями
 * - список пригородных адресов с частными домами и их жителями
 * <p>
 * Надо:
 * Вывести 1 плоский список строк, каждая из которых: имяЖителя -- улица -- номерДома
 * <p>
 * <p>
 * Классы сущностей - third-party с изначально непродуманной структурой: она либо идентична, либо схожа в части необходимых нам полей,
 * но при этом они не находятся ни в какой иерархии, так что сделать какой-то обобщенный метод не получается и приходится дублировать код.
 * <p>
 * Хорошо бы придумать какой-то адаптер, но мы не можем менять third-party классы, чтобы заимплементить какой-то общий интерфейс для дальнейшей работы с ним
 */
public class Main {

    public static void main(String[] args) {

        List<ApartmentHouse> aparts = Provider.getApartments();
        List<PrivateHouse> houses = Provider.getHouses();

        aparts.stream().map(Main::processApartment).flatMap(List::stream).forEach(System.out::println);
        houses.stream().map(Main::processPrivateHouse).flatMap(List::stream).forEach(System.out::println);


    }

    /*
     * Методы ниже приходится фактически дублировать, поскольку все сущности несмотря на схожесть структуры находятся вне всякой иерархии
     */


    private static List<String> processApartment(ApartmentHouse house) {
        String street = house.getAddress().getStreet();
        int houseNumber = house.getAddress().getHouseNumber();
        List<ApartmentResident> residents = house.getResidents();

        return residents
                .stream()
                .map(r -> r.getName() + " -- " + street + " -- " + houseNumber)
                .collect(Collectors.toList());
    }

    private static List<String> processPrivateHouse(PrivateHouse house) {
        String street = house.getAddress().getStreet();
        int houseNumber = house.getAddress().getHouseNumber();
        List<PrivateHouseResident> residents = house.getResidents();

        return residents
                .stream()
                .map(r -> r.getName() + " -- " + street + " -- " + houseNumber)
                .collect(Collectors.toList());
    }


}
