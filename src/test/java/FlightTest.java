import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS_A380);
        flight = new Flight("FR756", "LHR", "GLA",
                "07:00", plane);
        passenger = new Passenger("Stan Smith", 2);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("LHR", flight.getDestination());
    }

    @Test
    public void canGetOriginr(){
        assertEquals("GLA", flight.getOrigin());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("07:00", flight.getDepartureTime());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void passengersListStartsEmpty(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(525, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(524, flight.getAvailableSeats());
    }

    @Test
    public void cantOverBookFlight(){
        for (int i = 0; i < flight.getPlane().getCapacity(); i ++){
            flight.bookPassenger(passenger);
        }
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(525, flight.getPassengers().size());
    }

}
