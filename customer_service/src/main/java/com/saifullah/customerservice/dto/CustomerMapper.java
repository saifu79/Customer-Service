package com.saifullah.customerservice.dto;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.saifullah.customerservice.dao.entities.CustomerEntities;


@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface CustomerMapper {
	
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customerEntitiesToDTO(CustomerEntities customerEntities);
}
