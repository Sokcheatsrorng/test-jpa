package org.example.testunijpa.features;


import org.example.testunijpa.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

     @GetMapping
    public Customer findAll(){
        return customerService.findAll();
     }

     @PostMapping
     public Customer save(Customer customer){
         return customerService.save(customer);
     }

     @PutMapping("{cus_id}")
    public  Customer update(@PathVariable  int cus_id, Customer customer){
        return customerService.update(cus_id,customer);
     }

     @GetMapping("/{phoneNumber}")
     public Customer findByPhoneNumber(@PathVariable String phoneNumber){
         return customerService.findByPhoneNumber(phoneNumber);
     }
}
