package repository.impl;

import model.Customer;
import repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private final List <Customer>  customers = new ArrayList<>();
    @Override
    public void save(Customer customer) {
        customers.add(customer);

    }

    @Override
    public Customer findById(int id) {
        for(Customer c : customers){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void update(Customer customer) {
        for (Customer customer1 : customers){
            if(customer1.getId() == customer.getId()){

                customer1.setName(customer.getName());
                customer1.setEmail(customer.getEmail());

            }

        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < customers.size();i++){
            if (customers.get(i).getId() == id){
                customers.remove(i);
            }
        }
    }
}
