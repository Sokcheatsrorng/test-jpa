package org.example.testunijpa.features;

import org.example.testunijpa.domain.Customer;

public interface CustomerService {


    Customer findAll();


    Customer save(Customer customer);


    Customer findByPhoneNumber(String phoneNumber);

    Customer update(int cus_id,Customer customer);
}
