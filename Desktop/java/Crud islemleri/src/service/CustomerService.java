package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    public void createCustomer(Customer customer);
    Customer ByCustomerId (int id);
    public List<Customer> findAll();
    public void update(Customer customer);
    public void delete(int id);
}
