package com.pluralsight;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class createFlightTest {

    Flight newFlight = new Flight();


    @Test
    public void createFlight() {
        assertEquals(newFlight.seats, 150);
        assertEquals(newFlight.passengers, 0);

    }

    @Test
    public void addPassengerTest() {
        newFlight.add1Passenger(3);
        assertEquals(newFlight.passengers, 3);
    }
}
