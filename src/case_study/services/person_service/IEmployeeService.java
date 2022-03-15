package case_study.services.person_service;


import case_study.models.person.Employee;
import case_study.services.IService;

public interface IEmployeeService extends IService<Employee> {
    @Override
    void create(Employee employee);
}
