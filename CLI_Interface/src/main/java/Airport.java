import java.util.ArrayList;

public class Airport {

    private String name;
    private ArrayList<Flight> flights;

    public Airport(String name) {
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlights() {
        return this.flights;
    }

    public void addNewFlight(Flight flight){
        this.flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.flights.remove(flight);
    }

    public void bookPassengerOnFlight(Passenger passenger, Flight flight){
        flight.addPassenger(passenger);
    }

    public ArrayList<Flight> displayAllFlights(){
        return this.flights;
    }


}
