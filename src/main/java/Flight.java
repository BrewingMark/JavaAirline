import java.util.ArrayList;
import java.util.Collection;

public class Flight {

    private String flightNumber;
    private String destination;
    private String origin;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String origin, String departureTime, Plane plane){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }


    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public Collection getPassengers() {
        return this.passengers;
    }

    public int getAvailableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0){
            this.passengers.add(passenger);
        }
    }

}
