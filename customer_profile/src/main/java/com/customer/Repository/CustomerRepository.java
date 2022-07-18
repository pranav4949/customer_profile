package com.customer.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.customer.Model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String>{
	@Query("{account :?0}")
	Optional<Customer>getAccountById(String id);

}
