package com.flightstatus.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "flights")
public class Flight {
    @Id
    private String id;
    private String number;
    private String status;
    private String gate;

    // Getters and Setters
}
