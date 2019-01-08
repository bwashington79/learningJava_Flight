package com.pluralsight.LearningExamples;

import com.pluralsight.LearningExamples.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class createFlightTest {

    private Flight newFlight = new Flight();

    //This test verifies the getSeats() getter method.  It returns the value of seats when the Flight object is created.
    @Test
    public void availableSeatsTst() {

        assertEquals(newFlight.getSeats(), 150);
    }

    //This test verifies the setSeats() setter method.
    @Test
    public void setSeatsTst() {

        int newNumOfSeats = 5;

        newFlight.setSeats(newNumOfSeats);

        assertEquals(newFlight.getSeats(), newNumOfSeats);
    }

    //This test verifies the getPassengers() getter method.  It returns the value of passengers when the Flight object is created.
    @Test
    public void numPassenger() {

        assertEquals(newFlight.getPassengers(), 0);
    }

    //This test verifies the setPassengers() setter method.
    @Test
    public void setPassengersTst() {

        int newNumOfPassengers = 50;

        newFlight.setPassengers(newNumOfPassengers);

        assertEquals(newFlight.getPassengers(), newNumOfPassengers);
    }


    @Test
    public void addPassengerTst() {
        int newPassengers = newFlight.add1Passenger(3);
        newFlight.add1Passenger(3);
        assertEquals(newPassengers, 3);
    }
}
