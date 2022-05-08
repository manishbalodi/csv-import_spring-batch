package com.manish.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
