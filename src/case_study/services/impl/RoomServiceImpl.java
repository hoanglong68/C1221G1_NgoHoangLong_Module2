package case_study.services.impl;

import case_study.models.facility.Room;
import case_study.utils.CheckValid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl {
    private String freeService;
    private String idRoom;
    Scanner scanner = new Scanner(System.in);
    private static final String REGEX_ID_ROOM = "^(SVRO)[-][\\d]{4}$";
    private static List<Room> roomList = new ArrayList<>();

    static {

    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        RoomServiceImpl.roomList = roomList;
    }

    public void addNewRoom() {
        System.out.print("enter id service(room): ");
        idRoom = CheckValid.regexInputString(scanner.nextLine(), REGEX_ID_ROOM,
                "wrong format ! SVRO-XXXX (X is number)");
        super.inputBaseInfoFacility();
        System.out.print("enter free service: ");
        freeService = scanner.nextLine();
        Room facility = new Room(idRoom, nameService, area, price, capacity, rentStyle, freeService);
        roomList.add(facility);
        super.create(facility);
    }
}
