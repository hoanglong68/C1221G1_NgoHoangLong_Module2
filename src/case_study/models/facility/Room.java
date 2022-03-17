package case_study.models.facility;


import java.util.Objects;

public class Room extends Facility {
    private String freeService;
    private String idRoom;

    public Room() {
    }

    public Room(String idRoom, String nameService, double area, int price, int capacity, String rentStyle, String freeService) {
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
    public String toConvert() {
        return idRoom + COMMA +
                super.toConvert() + COMMA +
                freeService
                ;
    }

    @Override
    public String toString() {

        return "Room{" + "idRoom='" + idRoom + '\''
                + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return idRoom.equals(room.idRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRoom);
    }
}
