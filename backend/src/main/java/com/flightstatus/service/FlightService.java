package com.flightstatus.service;

import com.flightstatus.model.Flight;
import com.flightstatus.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight getFlightById(String id) {
        return flightRepository.findById(id).orElse(null);
    }

    public Flight saveOrUpdateFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
