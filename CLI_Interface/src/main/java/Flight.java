import java.util.ArrayList;

public class Flight {

    private String destination;
    private int id;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, int id) {
        this.destination = destination;
        this.id = id;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightID() {
        return this.id;
    }

    public void setFlightID(int id) {
        this.id = id;
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
