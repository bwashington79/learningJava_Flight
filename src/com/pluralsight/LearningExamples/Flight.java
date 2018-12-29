package com.pluralsight.LearningExamples;

public class Flight {
    public int passengers;
    public int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
    }

    public boolean hasRoom(Flight f2){
        int total = passengers + f2.passengers;
        return total <= seats;
    }

    public int add1Passenger(int numOfPassengers){

        if(passengers < seats){

            passengers += numOfPassengers;
        }

        return passengers;
    }
}