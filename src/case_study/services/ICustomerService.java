package case_study.services;

import case_study.models.person.Customer;

public interface ICustomerService extends IService<Customer> {
    @Override
    void create(Customer customer);
}
