import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TravelTests {

    private Passenger passenger;
    private Flight flight;


    @Before
    public void before(){
        passenger = new Passenger("Rob", 3);
        flight = new Flight(PlaneType.CESSNA172, "FR756", "GLA", "EDI", "1800");
    }

    @Test
    public void passengerHasName(){
        assertEquals("Rob", passenger.getName());
    }

    @Test
    public void getLuggageCount(){
        assertEquals(3, passenger.getLuggageCount());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(4, flight.getCapacity());
    }

    @Test
    public void getAvailableSeats(){
        assertEquals(4, flight.getAvailableSeats());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(3, flight.getAvailableSeats());
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void cannotOverbookFlight(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(0, flight.getAvailableSeats());
        assertEquals(4, flight.getPassengerCount());
    }


}
