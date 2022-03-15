package case_study.services.person_service;

import case_study.models.person.Customer;
import case_study.services.IService;

public interface ICustomerService extends IService<Customer> {
    @Override
    void create(Customer customer);
}
