package com.crudexamples.crudExamples.Controller;


import com.crudexamples.crudExamples.Entitiy.Customer;
import com.crudexamples.crudExamples.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/save")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer addCustomer = customerService.addCustomer(customer);
        return new ResponseEntity<>(addCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long id){
        Customer getCustomer = customerService.getCustomerById(id);
        return new ResponseEntity<>(getCustomer, HttpStatus.FOUND);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getCustomers(){
        List<Customer> allCustomers =  customerService.findAllCustomer();
        return new ResponseEntity<>(allCustomers, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable("id") Long id){
        customerService.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
