package com.farinas.customer.service;

import com.farinas.customer.entity.Customer;
import com.farinas.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Customer customerDB = customerRepository.findCustomerByIdentification(customer.getIdentification());
        if (customerDB != null){
            return  customerDB;
        }
        customerDB = customerRepository.save ( customer );
        return customerDB;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customerDB = getCustomerById(customer.getId()).orElse(null);
        if (customerDB == null){
            return  null;
        }
        customerDB.setName(customer.getName());
        customerDB.setPassword(customer.getPassword());
        customerDB.setStatus(customer.getStatus());
        customerDB.setAddress(customer.getAddress());
        customerDB.setAge(customer.getAge());
        customerDB.setGender(customer.getGender());
        customerDB.setPhoneNumber(customer.getPhoneNumber());
        customerDB.setIdentification(customer.getIdentification());

        return  customerRepository.save(customerDB);
    }

    @Override
    public Customer deleteCustomer(Customer customer) {
        return null;
    }
}
