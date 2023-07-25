import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Heathrow", 1);
        passenger = new Passenger("Zaiyad", "1234", 1);
    }


    @Test
    void addPassenger() {
        flight.addPassenger(passenger);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
    }

    @Test
    void removePassenger() {
        flight.addPassenger(passenger);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
        flight.removePassenger(passenger);
        assertThat(flight.getPassengers().size()).isEqualTo(0);
    }
}