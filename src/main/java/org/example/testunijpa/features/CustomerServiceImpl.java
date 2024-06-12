package org.example.testunijpa.features;

import org.example.testunijpa.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService{
    private final CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @Override
    public Customer findAll() {
        return customerDao.findAll();
    }

    @Transactional
    @Override
    public Customer save(Customer customer) {
        Customer result = customerDao.save(customer);
        return result;
    }


    @Override
    public Customer findByPhoneNumber(String phoneNumber) {
        return customerDao.findByPhoneNumber(phoneNumber);
    }

    @Transactional
    @Override
    public Customer update(int cus_id, Customer customer) {
        return null;
    }


}
