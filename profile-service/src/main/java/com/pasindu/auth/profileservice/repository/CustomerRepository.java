package com.pasindu.auth.profileservice.repository;


import com.pasindu.auth.profileservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
