package case_study.services.impl;

import case_study.models.facility.Villa;
import case_study.utils.CheckValid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl extends FacilityServiceImpl {
    private String standardOfRoom, idVilla;
    private double poolArea;
    Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID_VILLA = "^(SVVL)[-][\\d]{4}$";
    private static List<Villa> villaList = new ArrayList<>();

    static {

    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        VillaServiceImpl.villaList = villaList;
    }

    public void addNewVilla() {
        System.out.print("enter id service(villa): ");
        idVilla = CheckValid.regexInputString(scanner.nextLine(), REGEX_ID_VILLA,
                "wrong format ! SVVL-XXXX (X is number)");
        super.inputBaseInfoFacility();
        System.out.print("enter standard of room: ");
        standardOfRoom = CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                "wrong name format ! please try again follow base Xx...x ");
        System.out.print("enter pool area: ");
        do {
            flag = false;
            if (30 < Double.parseDouble(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_AREA,
                    "condition ( area > 30)"))) {
                poolArea = Double.parseDouble(temp);
                flag = true;
            }
        } while (!flag);
        Villa facility = new Villa(idVilla, nameService, area, price, capacity, rentStyle, standardOfRoom, poolArea);
        villaList.add(facility);
        super.create(facility);
    }
}
