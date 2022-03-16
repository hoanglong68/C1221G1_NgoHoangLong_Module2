package case_study.services.facility_service;

import case_study.models.facility.House;
import case_study.utils.CheckValid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl extends FacilityServiceImpl {
    private String standardOfRoom;
    private int floors;
    private String idHouse;
    Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID_HOUSE = "^(SVHO)[-][\\d]{4}$";
    private static final String REGEX_ID_FLOOR = "^\\d+$";
    private static List<House> houseList = new ArrayList<>();

    static {
        House house1 = new House("SVHO-0001", "House1", 500, 700, 5, "days", "deluxe", 2);
        House house2 = new House("SVHO-0002", "House2", 700, 800, 5, "days", "deluxe", 2);
        House house3 = new House("SVHO-0003", "House3", 800, 1000, 9, "months", "suit", 3);
        houseList.add(house1);
        FacilityServiceImpl.getFacilityList().put(house1, 0);
        houseList.add(house2);
        FacilityServiceImpl.getFacilityList().put(house2, 0);
        houseList.add(house3);
        FacilityServiceImpl.getFacilityList().put(house3, 0);
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        HouseServiceImpl.houseList = houseList;
    }

    public void addNewHouse() {
        System.out.print("enter id service(house): ");
        idHouse = CheckValid.regexInputString(scanner.nextLine(), REGEX_ID_HOUSE,
                "wrong format ! SVHO-XXXX (X is number)");
        super.inputBaseInfoFacility();
        System.out.print("enter standard of room: ");
        standardOfRoom = CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                "wrong name format ! please try again follow base Xx...x ");
        System.out.print("enter number of floors: ");
        do {
            if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_ID_FLOOR,
                    "must be a positive number"))) {
                floors = Integer.parseInt(temp);
                flag = true;
            }
        } while (!flag);
        House facility = new House(idHouse, nameService, area, price, capacity, rentStyle, standardOfRoom, floors);
        houseList.add(facility);
        super.create(facility);
    }
}
