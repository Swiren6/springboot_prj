package com.example.demo3.Services;


import com.example.demo3.Models.Customer;
import com.example.demo3.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

