package case_study.services.impl;

import case_study.models.facility.Facility;
import case_study.services.IFacilityService;
import case_study.utils.CheckValid;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    protected String nameService, rentStyle;
    protected int price, capacity;
    protected double area;
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static List<Facility> facilityMaintanceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    protected static final String REGEX_STRING = "^[A-Z][a-z]*$";
    protected static final String REGEX_AREA = "^\\d{2,}";
    private static final String REGEX_PRICE = "^\\d+";
    private static final String REGEX_CAPACITY = "^\\d{1,2}";
    protected boolean flag;
    protected String temp;

    public static Map<Facility, Integer> getFacilityList() {
        return facilityList;
    }

    public static void setFacilityList(Map<Facility, Integer> facilityList) {
        FacilityServiceImpl.facilityList = facilityList;
    }

    @Override
    public void read() {
        for (Map.Entry<Facility, Integer> facility : FacilityServiceImpl.getFacilityList().entrySet()) {
            System.out.println(facility.getKey() + " --- value: " + facility.getValue());
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
        nameService = CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                "wrong name format ! please try again follow base Xx...x ");
        System.out.print("enter area: ");
        do {
            flag = false;
            if (30 < Double.parseDouble(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_AREA,
                    "condition ( area > 30)"))) {
                area = Double.parseDouble(temp);
                flag = true;
            }
        } while (!flag);
        System.out.print("enter price: ");
        do {
            flag = false;
            if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_PRICE,
                    "must be a positive number"))) {
                area = Integer.parseInt(temp);
                flag = true;
            }
        } while (!flag);
        System.out.print("enter capacity: ");
        do {
            flag = false;
            if (0 < Integer.parseInt(temp = CheckValid.regexInputString(scanner.nextLine(), REGEX_CAPACITY,
                    "must be a positive number and < 20"))) {
                capacity = Integer.parseInt(temp);
                flag = true;
            }
        } while (!flag);
        System.out.print("enter style of rent: ");
        rentStyle = CheckValid.regexInputString(scanner.nextLine(), REGEX_STRING,
                "wrong name format ! please try again follow base Xx...x ");
    }

    public static void checkFacility() {

    }
}
