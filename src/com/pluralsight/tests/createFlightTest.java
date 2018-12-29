package com.pluralsight.tests;

import com.pluralsight.LearningExamples.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class createFlightTest {

    Flight newFlight = new Flight();


    @Test
    public void createFlightTst() {
        assertEquals(newFlight.seats, 150);
        assertEquals(newFlight.passengers, 0);

    }

    @Test
    public void addPassengerTst() {
        newFlight.add1Passenger(3);
        assertEquals(newFlight.passengers, 3);
    }
}
