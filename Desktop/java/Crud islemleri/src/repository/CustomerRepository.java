package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {

    public void save(Customer customer);
    public Customer findById(int id);
    public List<Customer>  findAll();
    public void update(Customer customer);
    public void delete(int id);

}
