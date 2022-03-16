package case_study.services.facility_service;

import case_study.models.facility.Facility;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<String, Integer> facilityList = new LinkedHashMap<>();

    public static Map<String, Integer> getFacilityList() {
        return facilityList;
    }

    public static void setFacilityList(Map<String, Integer> facilityList) {
        FacilityServiceImpl.facilityList = facilityList;
    }

    @Override
    public void read() {

    }

    @Override
    public void create(Facility facility) {

    }

    @Override
    public void update(int index) {

    }

    @Override
    public void readMaintanceList() {

    }
}
