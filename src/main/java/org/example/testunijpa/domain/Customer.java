package org.example.testunijpa.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
    private int cus_id;

    private String cus_firstName;

    private String cus_lastName;

    private String cus_phoneNumber;

    // Getters and Setters

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_firstName() {
        return cus_firstName;
    }

    public void setCus_firstName(String cus_firstName) {
        this.cus_firstName = cus_firstName;
    }

    public String getCus_lastName() {
        return cus_lastName;
    }

    public void setCus_lastName(String cus_lastName) {
        this.cus_lastName = cus_lastName;
    }

    public String getCus_phoneNumber() {
        return cus_phoneNumber;
    }

    public void setCus_phoneNumber(String cus_phoneNumber) {
        this.cus_phoneNumber = cus_phoneNumber;
    }
}
