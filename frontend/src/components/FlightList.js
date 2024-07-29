import React from 'react';
import FlightDetails from './FlightDetails';

const FlightList = ({ flights }) => {
  return (
    <div>
      {flights.map(flight => (
        <FlightDetails key={flight.id} flight={flight} />
      ))}
    </div>
  );
};

export default FlightList;
