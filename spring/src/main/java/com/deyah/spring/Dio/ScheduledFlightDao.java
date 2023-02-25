package com.deyah.spring.Dio;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.deyah.spring.Entity.ScheduledFlight;

public interface ScheduledFlightDao extends CrudRepository<ScheduledFlight, BigInteger> { }