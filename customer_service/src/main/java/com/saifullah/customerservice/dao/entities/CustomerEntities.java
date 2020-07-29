package com.saifullah.customerservice.dao.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "customer")
@Data
public class CustomerEntities {
	//@Id
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String city;
    private String country;

}
