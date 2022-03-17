package case_study.services;

import case_study.models.facility.Facility;

public interface IFacilityService extends IService <Facility> {
     void readMaintanceList();
}
