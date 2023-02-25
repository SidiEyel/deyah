package com.deyah.spring.Service;

import java.math.BigInteger;

import com.deyah.spring.exceptions.RecordNotFoundException;
import com.deyah.spring.exceptions.ScheduledFlightNotFoundException;
import com.deyah.spring.Entity.ScheduledFlight;

public interface ScheduledFlightService {
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
}