package com.deyah.spring.Dio;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;

import com.deyah.spring.Entity.Schedule;

public interface ScheduleDao extends CrudRepository<Schedule, BigInteger> { }