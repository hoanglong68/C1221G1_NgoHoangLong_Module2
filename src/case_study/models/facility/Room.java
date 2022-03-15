package case_study.models.facility;


public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, int area, int price, int capacity, String rentStyle, String freeService) {
        super(nameService, area, price, capacity, rentStyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
