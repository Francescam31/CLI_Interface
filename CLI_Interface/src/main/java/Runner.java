import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Airport airport = new Airport("Heathrow");
        Flight flight1 = new Flight("NYC", 1);
        Flight flight2 = new Flight("Dublin", 2);
        Flight flight3 = new Flight("Paris", 3);
        airport.addNewFlight(flight1);
        airport.addNewFlight(flight2);
        airport.addNewFlight(flight3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String passengerName = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String contactInfo = scanner.nextLine();
        int passengerID = 1;

        Passenger passenger1 = airport.newPassenger(passengerName, contactInfo, passengerID);

        airport.displayAllFlights();

        System.out.println("Enter your destination: ");
        String destination = scanner.nextLine();

        boolean passengerBooked = airport.bookPassengerOnFlight(passenger1, destination);
        if (passengerBooked){
            System.out.println("Your flight to " + destination + " has been booked");
        }else{
            System.out.println("No flights available");
        }



        }







    }


