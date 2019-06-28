package com.pasindu.auth.profileservice.service;


import com.pasindu.auth.profileservice.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
