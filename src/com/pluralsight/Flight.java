package com.pluralsight;

public class Flight {

    public int passengers;
    public int seats;

    Flight(){
        seats = 150;
        passengers = 0;
    }

    int add1Passenger(int numOfPassengers){

        if(passengers < seats){

            passengers += numOfPassengers;
        }

        return passengers;
    }
}