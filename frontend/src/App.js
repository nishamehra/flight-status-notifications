import React, { useEffect, useState } from 'react';
import FlightList from './components/FlightList';
import './App.css';

function App() {
  const [flights, setFlights] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/flights')
      .then(response => response.json())
      .then(data => setFlights(data));
  }, []);

  return (
    <div className="App">
      <h1>Flight Status</h1>
      <FlightList flights={flights} />
    </div>
  );
}

export default App;
