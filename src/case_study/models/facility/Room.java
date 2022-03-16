package case_study.models.facility;


public class Room extends Facility {
    private String freeService;
    private String idRoom;

    public Room() {
    }

    public Room(String idRoom, String nameService, int area, int price, int capacity, String rentStyle, String freeService) {
        super(nameService, area, price, capacity, rentStyle);
        this.idRoom = idRoom;
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "Room{" + "idRoom='" + idRoom + '\''
                + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
