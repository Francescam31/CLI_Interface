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

    public boolean bookPassengerOnFlight(Passenger passenger, String destination){
        for(Flight flight : this.flights){
            if(flight.getDestination().equals(destination)){
                flight.addPassenger(passenger);
                return true;
            }
        }
        return false;
    }

    public void displayAllFlights(){
        for(Flight flight : this.flights){
            System.out.println("Flight " + flight.getFlightID() + " to " + flight.getDestination());
        }
    }

    public Passenger newPassenger(String name, String contactInfo, int id){
        return new Passenger(name, contactInfo, id);
    }

    public int createId(){
        int passengerCount = 0;
        for(Flight flight : this.flights){
            passengerCount += flight.getPassengers().size();
        }
        return passengerCount + 1;
    }


}
