package com.saifullah.customerservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saifullah.customerservice.dao.CustomerRepository;
import com.saifullah.customerservice.dao.entities.CustomerEntities;
import com.saifullah.customerservice.dto.CustomerDTO;
import com.saifullah.customerservice.dto.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    //private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Override
    public CustomerDTO getCustomer(Integer customerId) throws Exception {
        //LOGGER.info("Fetching Order details for OrderId: {}", customerId);
        Optional<CustomerEntities> customerEntities = customerRepository.findByCustomerId(customerId);
        
        CustomerDTO customerDTO = null;

        if (customerEntities.isPresent()) {
            customerDTO = CustomerMapper.INSTANCE.customerEntitiesToDTO(customerEntities.get());
        }

        return customerDTO;
    }
    
    @Override
    public CustomerEntities addCustomer(CustomerEntities customerEntities)
    {
    	return customerRepository.save(customerEntities);
    	//return CustomerMapper.INSTANCE.customerEntitiesToDTO(customerEntities);
    }
}
