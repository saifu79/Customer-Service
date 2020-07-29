package com.saifullah.customerservice.service;

import com.saifullah.customerservice.dao.entities.CustomerEntities;
import com.saifullah.customerservice.dto.CustomerDTO;

public interface CustomerService {
	CustomerDTO getCustomer(Integer customerId) throws Exception;
	CustomerEntities addCustomer(CustomerEntities customerEntities);

}
