package case_study.services;

import case_study.models.person.Customer;

public interface ICustomerService extends IService<Customer> {
    void update(int index);
    void create(Customer customer);
}
