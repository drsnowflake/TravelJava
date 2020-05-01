import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String departAirport;
    private String arriveAirport;
    private String departTime;


    public Flight(PlaneType planeType,
                  String flightNumber,
                  String departAirport,
                  String arriveAirport,
                  String departTime
    ) {
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arriveAirport = arriveAirport;
        this.departTime = departTime;
    }

    public int getCapacity() {
        return planeType.getCapacity();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public int getAvailableSeats() {
        return getCapacity() - getPassengerCount();
    }

    public void addPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0)
        this.passengers.add(passenger);
    }


}
