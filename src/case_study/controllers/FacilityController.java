package case_study.controllers;

import case_study.services.facility_service.FacilityServiceImpl;
import case_study.services.facility_service.HouseServiceImpl;
import case_study.services.facility_service.RoomServiceImpl;
import case_study.services.facility_service.VillaServiceImpl;


public class FacilityController {
    private static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    private VillaServiceImpl villaService = new VillaServiceImpl();
    private HouseServiceImpl houseService = new HouseServiceImpl();
    private RoomServiceImpl roomService = new RoomServiceImpl();

    public void addNewService(int choice) {
        switch (choice) {
            case 1:
                villaService.addNewVilla();
                break;
            case 2:
                houseService.addNewHouse();
                break;
            case 3:
                roomService.addNewRoom();
                break;
        }
    }

    public void displayServiceList() {
        facilityService.read();
    }

    public void displayServiceListNeedToMaintenance() {
        facilityService.readMaintanceList();
    }
}
