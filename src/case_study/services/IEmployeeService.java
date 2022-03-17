package case_study.services;


import case_study.models.person.Employee;

public interface IEmployeeService extends IService<Employee> {
    @Override
    void create(Employee employee);
}
