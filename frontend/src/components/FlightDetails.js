import React from 'react';

const FlightDetails = ({ flight }) => {
  return (
    <div className="flight">
      <h2>Flight Number: {flight.number}</h2>
      <p>Status: {flight.status}</p>
      <p>Gate: {flight.gate}</p>
    </div>
  );
};

export default FlightDetails;
