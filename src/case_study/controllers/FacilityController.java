package case_study.controllers;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.impl.FacilityServiceImpl;
import case_study.services.impl.HouseServiceImpl;
import case_study.services.impl.RoomServiceImpl;
import case_study.services.impl.VillaServiceImpl;
import case_study.utils.IoTextFile;

import java.util.List;


public class FacilityController {
    private static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    private static VillaServiceImpl villaService = new VillaServiceImpl();
    private static HouseServiceImpl houseService = new HouseServiceImpl();
    private static RoomServiceImpl roomService = new RoomServiceImpl();
    private static final String VILLA_CSV_PATH = "src\\case_study\\data\\villa.csv";
    private static final String HOUSE_CSV_PATH = "src\\case_study\\data\\house.csv";
    private static final String ROOM_CSV_PATH = "src\\case_study\\data\\room.csv";

    public static FacilityServiceImpl getFacilityService() {
        return facilityService;
    }

    public static void setFacilityService(FacilityServiceImpl facilityService) {
        FacilityController.facilityService = facilityService;
    }

    public VillaServiceImpl getVillaService() {
        return villaService;
    }

    public void setVillaService(VillaServiceImpl villaService) {
        this.villaService = villaService;
    }

    public HouseServiceImpl getHouseService() {
        return houseService;
    }

    public void setHouseService(HouseServiceImpl houseService) {
        this.houseService = houseService;
    }

    public RoomServiceImpl getRoomService() {
        return roomService;
    }

    public void setRoomService(RoomServiceImpl roomService) {
        this.roomService = roomService;
    }

    public static String getVillaCsvPath() {
        return VILLA_CSV_PATH;
    }

    public static String getHouseCsvPath() {
        return HOUSE_CSV_PATH;
    }

    public static String getRoomCsvPath() {
        return ROOM_CSV_PATH;
    }

    static {
        convertStringListToVillaList(VILLA_CSV_PATH);
        convertStringListToHouseList(HOUSE_CSV_PATH);
        convertStringListToRoomList(ROOM_CSV_PATH);
    }

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
            case 4:
                break;
            default:
                System.out.println("wrong choice !");
        }
    }

    public void displayServiceList() {
        facilityService.read();
    }

    public void displayServiceListNeedToMaintenance() {
        facilityService.readMaintanceList();
    }

    public static void convertStringListToVillaList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                Villa villa = new Villa(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], Double.parseDouble(array[7]));
                villaService.getVillaList().add(villa);
                facilityService.create(villa);
            }
        }
    }

    public static void convertStringListToHouseList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                House house = new House(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], Integer.parseInt(array[7]));
                houseService.getHouseList().add(house);
                facilityService.create(house);
            }
        }
    }

    public static void convertStringListToRoomList(String csvPath) {
        List<String> stringList = IoTextFile.readFromCSVFile(csvPath);
        String array[];
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).isEmpty()) {
                array = stringList.get(i).split(",");
                Room room = new Room(array[0], array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6]);
                roomService.getRoomList().add(room);
                facilityService.create(room);
            }
        }
    }
}
