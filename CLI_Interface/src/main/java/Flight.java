import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightID;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return this.flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
    public void addPassenger(Passenger passenger) {
    passengers.add(passenger);
    }
    public void removePassenger(Passenger passenger) {
    passengers.remove(passenger);
    }

    
}
