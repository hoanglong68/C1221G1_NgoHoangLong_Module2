package case_study.services;

import case_study.models.person.Customer;

public interface ICustomerService extends IService{
    void read();
    void update(int index);
    void create(Customer customer);
}
