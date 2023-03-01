public class Transportation {
    // fields
    private String type;
    private double cost;
    private Boolean ticket;

    private Boolean rental;
    private int speed;

    private int capacity;

    // constructor
    public Transportation(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity){
        this.type = type;
        this.cost = cost;
        this.ticket = ticket;
        this.rental = rental;
        this.speed = speed;
        this.capacity = capacity;
    }
    // Accessors
    public String getType() {
        return type;
    }

    public Boolean getTicket() {
        return ticket;
    }

    public double getCost() {
        return cost;
    }

    public Boolean getRental() {
        return rental;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    // Mutators
    public void setType(String type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTicket(Boolean ticket) {
        this.ticket = ticket;
    }

    public void setRental(Boolean rental) {
        this.rental = rental;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s%n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d%n", getType(), getCost(), getTicket(), getRental(), getSpeed(), getCapacity());
    }
}
class LandTransportation extends Transportation{
    // fields
    private int numWheels;

    // constructor
    public LandTransportation(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int numWheels){
        super(type, cost, ticket, rental, speed, capacity);
        this.numWheels = numWheels;
    }

    // Accessor
    public int getNumWheels() {
        return numWheels;
    }

    // Mutator
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
class WaterTransportation extends Transportation{
    // fields
    private int draft;
    private int length;

    // constructor
    public WaterTransportation(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int draft, int length){
        super(type, cost, ticket, rental, speed, capacity);
        this.draft = draft;
        this. length = length;
    }

    // Accessors
    public int getDraft() {
        return draft;
    }
    public int getLength() {
        return length;
    }
    // Mutators
    public void setDraft(int draft) {
        this.draft = draft;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
class AirTransportation extends Transportation{
    // fields
    private int wingspan;
    private int altitude;

    // constructor
    AirTransportation(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int wingspan, int altitude){
        super(type, cost, ticket, rental, speed, capacity);
        this.wingspan = wingspan;
        this. altitude = altitude;
    }
    // Accessors
    public int getWingspan() {
        return wingspan;
    }
    public int getAltitude() {
        return altitude;
    }
    // Mutators
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

}
class Automobile extends LandTransportation{
    // fields
    private String fuelType;

    // constructor

    public Automobile(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int numWheels, String fuelType) {
        super(type, cost, ticket, rental, speed, capacity, numWheels);
        this.fuelType = fuelType;
    }
    // Accessors
    public String getFuelType() {
        return fuelType;
    }
    // Mutators
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Number Wheels","Fuel Type") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15s %n", "Automobile", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getNumWheels(), getFuelType());
    }
}
class Bus extends LandTransportation{
    // fields
    private Boolean school;
    // constructor
    public Bus(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int numWheels, Boolean school) {
        super(type, cost, ticket, rental, speed, capacity, numWheels);
        this.school = school;
    }
    // Accessor
    public Boolean getSchool() {
        return school;
    }
    // Mutator
    public void setSchool(Boolean school) {
        this.school = school;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Number Wheels", "School") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15s %n", "Bus", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getNumWheels(), getSchool().toString());
    }


}
class Bike extends LandTransportation{
    // fields
    private int numGears;
    // constructor
    public Bike(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int numWheels, int numGears) {
        super(type, cost, ticket, rental, speed, capacity, numWheels);
        this.numGears = numGears;
    }
    // Accessor
    public int getNumGears() {
        return numGears;
    }
    // Mutators
    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Number Wheels", "Number Gears") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %n", "Bike", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getNumWheels(), getNumGears());
    }
}
class Train extends LandTransportation{
    // fields
    int numCars;
    // constructor
    public Train(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int numWheels, int numCars) {
        super(type, cost, ticket, rental, speed, capacity, numWheels);
        this.numCars = numCars;
    }
    // Accessors
    public int getNumCars() {
        return numCars;
    }
    // Mutators
    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Number Wheels", "Number Cars") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %n", "Train", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getNumWheels(), getNumCars());
    }
}
class Ship extends WaterTransportation{
    // fields
    private int numSails;
    // constructor
    public Ship(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int draft, int length, int numSails) {
        super(type, cost, ticket, rental, speed, capacity, draft, length);
        this.numSails = numSails;
    }
    // Accessors
    public int getNumSails() {
        return numSails;
    }
    // Mutators
    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Draft", "Length", "Number Sails") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15d %n", "Ship", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getDraft(), getLength(), getNumSails());
    }
}

class Boat extends WaterTransportation{
    // fields
    private int numMotors;
    //constructor
    public Boat(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int draft, int length, int numMotors) {
        super(type, cost, ticket, rental, speed, capacity, draft, length);
        this.numMotors = numMotors;
    }
    // Accessors
    public int getNumMotors() {
        return numMotors;
    }
    // Mutators
    public void setNumMotors(int numMotors) {
        this.numMotors = numMotors;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Draft", "Length", "Number Motors") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15d %n", "Boat", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getDraft(), getLength(), getNumMotors());
    }
}
class Submarine extends WaterTransportation{
    // fields
    private Boolean military;
    // constructor

    public Submarine(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int draft, int length, Boolean military) {
        super(type, cost, ticket, rental, speed, capacity, draft, length);
        this.military = military;
    }
    // Accessors
    public Boolean getMilitary() {
        return military;
    }
    // Mutators
    public void setMilitary(Boolean military) {
        this.military = military;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Draft", "Length", "Number Sails", "Military") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15s %n", "Submarine", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getDraft(), getLength(), getMilitary().toString());
    }
}
class Helicopter extends AirTransportation{
    // fields
    private int numPropellers;
    //constructor
    public Helicopter(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int wingspan, int altitude, int numPropellers) {
        super(type, cost, ticket, rental, speed, capacity, wingspan, altitude);
        this.numPropellers = numPropellers;
    }
    // Accessors
    public int getNumPropellers() {
        return numPropellers;
    }
    // Mutators
    public void setNumPropellers(int numPropellers) {
        this.numPropellers = numPropellers;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Wingspan", "Altitude", "Propellers") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15d %n", "Helicopter", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getWingspan(), getAltitude(), getNumPropellers());
    }
}
class Plane extends AirTransportation{
    // fields
    private String airline;
    // constructor
    public Plane(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int wingspan, int altitude, String airline) {
        super(type, cost, ticket, rental, speed, capacity, wingspan, altitude);
        this.airline = airline;
    }
    // Accessors
    public String getAirline() {
        return airline;
    }
    // Mutators
    public void setAirline(String airline) {
        this.airline = airline;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Wingspan", "Altitude", "Airline") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15s %n", "Plane", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getWingspan(), getAltitude(), getAirline());
    }
}
class Dirigible extends AirTransportation{
    // fields
    private int gasVolume;
    // constructor
    public Dirigible(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int wingspan, int altitude, int gasVolume) {
        super(type, cost, ticket, rental, speed, capacity, wingspan, altitude);
        this.gasVolume = gasVolume;
    }
    // Accessors
    public int getGasVolume() {
        return gasVolume;
    }
    // Mutators
    public void setGasVolume(int gasVolume) {
        this.gasVolume = gasVolume;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Wingspan", "Altitude", "Gas Volume") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15d %n", "Dirigible", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getWingspan(), getAltitude(), getGasVolume());
    }
}
class HotAirBalloon extends AirTransportation{
    // fields
    private int gasVolume;
    // constructor
    public HotAirBalloon(String type, double cost, Boolean ticket, Boolean rental, int speed, int capacity, int wingspan, int altitude, int gasVolume) {
        super(type, cost, ticket, rental, speed, capacity, wingspan, altitude);
        this.gasVolume = gasVolume;
    }
    // Accessors
    public int getGasVolume() {
        return gasVolume;
    }
    // Mutators
    public void setGasVolume(int gasVolume) {
        this.gasVolume = gasVolume;
    }
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Type", "Cost", "Ticket", "Rental", "Speed", "Capacity", "Wingspan", "Altitude", "Gas Volume") +
                String.format("%-20s $%-14.2f %-15s %-15s %-15d %-15d %-15d %-15d %-15d %n", "Hot Air Balloon", getCost(), getTicket(), getRental(), getSpeed(), getCapacity(), getWingspan(), getAltitude(), getGasVolume());
    }




}



