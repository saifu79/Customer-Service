package com.saifullah.customerservice.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saifullah.customerservice.dao.entities.CustomerEntities;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntities, Integer>{
	Optional<CustomerEntities> findByCustomerId(Integer customerId);

}
