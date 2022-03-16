package case_study.services.facility_service;

import case_study.models.facility.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl extends FacilityServiceImpl {
    private String standardOfRoom, idVilla;
    private int poolArea;
    Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID_VILLA = "^&";
    private static List<Villa> villaList = new ArrayList<>();
static {
    Villa villa1 = new Villa("SVVL-0001","Villa1",1000,1200,15,"days","deluxe",20);
    Villa villa2 =new Villa("SVVL-0002","Villa2",1000,1200,15,"days","deluxe",20);
    Villa villa3 =new Villa("SVVL-0003","Villa3",1100,1500,18,"days","deluxe",20);
    villaList.add(villa1);
    FacilityServiceImpl.getFacilityList().put(villa1,0);
    villaList.add(villa2);
    FacilityServiceImpl.getFacilityList().put(villa2,0);
    villaList.add(villa3);
    FacilityServiceImpl.getFacilityList().put(villa3,0);
}
    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        VillaServiceImpl.villaList = villaList;
    }

    public void addNewVilla() {
        System.out.print("enter id service(villa): ");
        idVilla = scanner.nextLine();
        super.inputBaseInfoFacility();
        System.out.print("enter standard of room: ");
        standardOfRoom = scanner.nextLine();
        System.out.print("enter pool area: ");
        poolArea = Integer.parseInt(scanner.nextLine());
        Villa facility = new Villa(idVilla,nameService,area,price,capacity,rentStyle,standardOfRoom,poolArea);
        villaList.add(facility);
        super.create(facility);
    }

}
