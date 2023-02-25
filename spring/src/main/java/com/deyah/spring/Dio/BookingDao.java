package com.deyah.spring.Dio;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.deyah.spring.Entity.Booking;

public interface BookingDao extends CrudRepository<Booking, BigInteger>  { }