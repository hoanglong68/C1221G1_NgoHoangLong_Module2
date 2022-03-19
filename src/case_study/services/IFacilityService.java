package case_study.services;

import case_study.models.facility.Facility;

public interface IFacilityService extends IService {
     void read();
     void create(Facility facility);
     void update(int index);
     void readMaintanceList();
}
