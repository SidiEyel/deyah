package com.deyah.spring.Dio;

import org.springframework.data.repository.CrudRepository;
import com.deyah.spring.Entity.Airport;

public interface AirportDao extends CrudRepository<Airport, String> { }
