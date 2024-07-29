package com.flightstatus.controller;

import com.flightstatus.model.Flight;
import com.flightstatus.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable String id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight saveOrUpdateFlight(@RequestBody Flight flight) {
        return flightService.saveOrUpdateFlight(flight);
    }
}
