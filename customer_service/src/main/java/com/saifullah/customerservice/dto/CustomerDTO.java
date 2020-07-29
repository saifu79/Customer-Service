package com.saifullah.customerservice.dto;


import lombok.Data;

/**
 * POJO for holding Order related data
 */
@Data
public class CustomerDTO {
	
    private Integer customerId;

    private String firstNmae;

    private String lastName;

    private String city;
    private String country;

}
