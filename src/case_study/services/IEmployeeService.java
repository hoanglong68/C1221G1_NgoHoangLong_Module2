package case_study.services;


import case_study.models.person.Employee;

public interface IEmployeeService extends IService {
    void read();
    void update(int index);
    void create(Employee employee);
}
