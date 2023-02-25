package com.deyah.spring.Dio;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.deyah.spring.Entity.Flight;
public interface FlightDao extends CrudRepository<Flight,BigInteger> { }