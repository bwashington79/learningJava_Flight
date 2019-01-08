package com.pluralsight.LearningExamples;

 class Flight {
    private int passengers;
    private int seats;

    public Flight(){
        seats = 150;
        passengers = 0;
    }

    //I understand getter/Accessor now.  Typically fields are private.  The way we expose through a getter
    public int getSeats(){
        return seats;
    }

     public int getPassengers(){
         return passengers;
     }


    public int add1Passenger(int numOfPassengers){

        if(passengers < seats){

            passengers += numOfPassengers;
        }

        return passengers;
    }
}