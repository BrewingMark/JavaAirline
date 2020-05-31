import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jane Doe", 3);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Jane Doe", passenger.getname());
    }

    @Test
    public void passengerHasNumOfBags(){
        assertEquals(3, passenger.getNumOfBags());
    }

}
