package case_study.services.facility_service;

import case_study.models.facility.Facility;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    protected String nameService, rentStyle;
    protected int area, price, capacity;
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static List<Facility> facilityMaintanceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static Map<Facility, Integer> getFacilityList() {
        return facilityList;
    }

    public static void setFacilityList(Map<Facility, Integer> facilityList) {
        FacilityServiceImpl.facilityList = facilityList;
    }

    @Override
    public void read() {
        for (Map.Entry<Facility, Integer> facility : FacilityServiceImpl.getFacilityList().entrySet()) {
            System.out.println(facility);
        }
    }

    @Override
    public void create(Facility facility) {
        FacilityServiceImpl.getFacilityList().put(facility, 0);
    }

    @Override
    public void update(int index) {

    }

    @Override
    public void readMaintanceList() {
        for (Facility facility : facilityMaintanceList
        ) {
            System.out.println(facility);
        }
    }

    public void inputBaseInfoFacility() {
        System.out.print("enter name service: ");
        nameService = scanner.nextLine();
        System.out.print("enter area: ");
        area = Integer.parseInt(scanner.nextLine());
        System.out.print("enter price: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("enter capacity: ");
        capacity = Integer.parseInt(scanner.nextLine());
        System.out.print("enter style of rent: ");
        rentStyle = scanner.nextLine();
    }
    public static void checkFacility(){

    }
}
