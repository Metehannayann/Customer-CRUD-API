package controller;

import model.Customer;

import java.util.List;

public interface CustomerController {
    public  void create(Customer customer);
    Customer ByCustomerId (int id);
    public List<Customer> findAll();
    public void update(Customer customer);
    public void delete(int id);
}
