    package org.example.testunijpa.features;

    import org.example.testunijpa.domain.Customer;

    public interface CustomerDao {

        Customer save(Customer customer);

       Customer findByPhoneNumber(String phoneNumber);

       Customer findAll();

        void update(int cus_id, Customer customer);


    }
