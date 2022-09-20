package com.crudexamples.crudExamples.Repositories;

import com.crudexamples.crudExamples.Entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
