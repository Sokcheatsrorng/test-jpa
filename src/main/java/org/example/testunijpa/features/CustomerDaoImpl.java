package org.example.testunijpa.features;

import org.example.testunijpa.domain.Customer;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer save(Customer customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    public Customer findByPhoneNumber(String phoneNumber) {
       Customer customers = (Customer) entityManager.createQuery(
                        "SELECT c FROM Customer c WHERE c.cus_phoneNumber = :phoneNumber", Customer.class)
                .setParameter("phoneNumber", phoneNumber)
                .getResultList();
        return customers;
    }

    @Override
    public Customer findAll() {
        return (Customer) entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }

    @Override
    public void update(int id, Customer customer) {
        entityManager.merge(customer);
    }
}
