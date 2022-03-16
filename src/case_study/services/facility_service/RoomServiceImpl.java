package case_study.services.facility_service;

import case_study.models.facility.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl extends FacilityServiceImpl{
    private String freeService;
    private String idRoom;
    Scanner scanner = new Scanner(System.in);
    private static List<Room> roomList = new ArrayList<>();
    static {
        Room room1 = new Room("SVRO-0001","Room1",500,200,2,"days","non");
        Room room2 =new Room("SVRO-0002","Room2",700,250,2,"days","non");
        Room room3 =new Room("SVRO-0003","Room3",800,300,2,"months","lunch");
        roomList.add(room1);
        FacilityServiceImpl.getFacilityList().put(room1,0);
        roomList.add(room2);
        FacilityServiceImpl.getFacilityList().put(room2,0);
        roomList.add(room3);
        FacilityServiceImpl.getFacilityList().put(room3,0);
    }
    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        RoomServiceImpl.roomList = roomList;
    }

    public void addNewRoom(){
        System.out.print("enter id service(room): ");
        idRoom = scanner.nextLine();
        super.inputBaseInfoFacility();
        System.out.print("enter free service: ");
        freeService = scanner.nextLine();
        Room facility = new Room(idRoom,nameService,area,price,capacity,rentStyle,freeService);
        roomList.add(facility);
        super.create(facility);
    }
}
