package com.crudexamples.crudExamples.Services;

import com.crudexamples.crudExamples.Entitiy.Customer;
import com.crudexamples.crudExamples.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;


    public Customer addCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Long customerId){
        return customerRepo.findById(customerId).get();
    }

    public void deleteCustomerById(Long customerId){
        customerRepo.deleteById(customerId);
    }}


