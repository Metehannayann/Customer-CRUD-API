package controller.impl;

import controller.CustomerController;
import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerControllerImpl implements CustomerController {
    private final CustomerService customerService = new CustomerServiceImpl();

    @Override
    public void create(Customer customer) {
        customerService.createCustomer(customer);
    }

    @Override
    public Customer ByCustomerId(int id) {
        return customerService.ByCustomerId(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @Override
    public void update(Customer customer) {
        customerService.update(customer);
    }

    @Override
    public void delete(int id) {
        customerService.delete(id);
    }
}
