package com.farinas.customer.web.controller;

import com.farinas.customer.entity.Customer;
import com.farinas.customer.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping()
    public ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<>(customerService.findAllCustomers(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id) {
        return customerService.getCustomerById(id)
                .map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    public ResponseEntity<?> saveCustomer(@Validated @RequestBody Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Customer cus = customerService.createCustomer(customer);
        cus = customerService.getCustomerById(cus.getId()).orElse(null);
        return new ResponseEntity<>(cus, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCategory(@Validated @RequestBody Customer customer, @PathVariable("id") int id, BindingResult bindingResult) {

            return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
