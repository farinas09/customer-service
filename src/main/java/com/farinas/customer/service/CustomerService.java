package com.farinas.customer.service;

import com.farinas.customer.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public List<Customer> findAllCustomers();
    public Optional<Customer> getCustomerById(Long id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
}