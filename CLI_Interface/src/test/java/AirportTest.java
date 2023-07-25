
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Flight flight;
    Airport airport;
    Passenger passenger;


    @BeforeEach
    public void setUp(){
         airport = new Airport("Heathrow");
         flight = new Flight("EasyJet",1);
         passenger = new Passenger("Zaiyad", "1234", 1);
    }


    @Test
    void addNewFlight() {

        airport.addNewFlight(flight);
        assertThat(airport.getFlights().size()).isEqualTo(1);
    }

    @Test
    void cancelFlight() {
         airport.addNewFlight(flight);
         assertThat(airport.getFlights().size()).isEqualTo(1);
         airport.cancelFlight(flight);
         assertThat(airport.getFlights().size()).isEqualTo(0);

    }

    @Test
    void bookPassengerOnFlight() {
        airport.bookPassengerOnFlight(passenger,"Dublin");
        assertThat(flight.getPassengers().size()).isEqualTo(1);
        assertThat(airport.getFlights().size()).isEqualTo(1);

    }

    @Test
    void displayAllFlights() {
    }
}