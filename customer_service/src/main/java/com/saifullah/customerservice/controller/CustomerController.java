package com.saifullah.customerservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.saifullah.customerservice.dao.entities.CustomerEntities;
import com.saifullah.customerservice.dto.CustomerDTO;
import com.saifullah.customerservice.service.CustomerService;



@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/customers/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable Integer customerId) throws Exception {
        return customerService.getCustomer(customerId);
    }
	
    @RequestMapping(value = "/customers", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerEntities addCustomer(@RequestBody CustomerEntities customerEntities) {
        return customerService.addCustomer(customerEntities);
    }
}
