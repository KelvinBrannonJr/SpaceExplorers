import java.util.ArrayList;

public class Shuttle {

    // Shuttle private members
    private String shuttleName;
    private String countryOrigin;
    private String researchPurpose;
    private int numOfRooms;
    private boolean hasRover;
    private double thrustPower;
    private double fuelCapacity;
    private ArrayList<Astronaut> crew = new ArrayList<>();


    // Default Shuttle Constructors
    public Shuttle() {
        this.shuttleName = "Shuttle Unknown";
        this.countryOrigin = "No Country";
        this.researchPurpose = "Research Purpose Unknown";
        this.numOfRooms = 0;
        this.hasRover = false;
        this.thrustPower = 0.0;
        this.fuelCapacity = 0.0;
        this.crew = null;
    }

    // Overloaded Shuttle Constructor
    public Shuttle(String shuttleName, String countryOrigin, String researchPurpose, int numOfRooms, boolean hasRover, double thrustPower, double fuelCapacity) {
        this.shuttleName = shuttleName;
        this.countryOrigin = countryOrigin;
        this.researchPurpose = researchPurpose;
        this.numOfRooms = numOfRooms;
        this.hasRover = hasRover;
        this.thrustPower = thrustPower;
        this.fuelCapacity = fuelCapacity;
        this.crew = null;

    }

    // Shuttle Setters
    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public void setResearchPurpose(String researchPurpose) {
        this.researchPurpose = researchPurpose;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setHasRover(boolean hasRover) {
        this.hasRover = hasRover;
    }

    public void setThrustPower(double thrustPower) { this.thrustPower = thrustPower; }

    public void setFuelCapacity(double fuelCapacity) { this.fuelCapacity = fuelCapacity; }

    // Shuttle Getters
    public String getShuttleName() {
        return this.shuttleName;
    }

    public String getCountryOrigin() {
        return this.countryOrigin;
    }

    public String getResearchPurpose() {
        return this.researchPurpose;
    }

    public int getNumOfRooms() {
        return this.numOfRooms;
    }

    public boolean getHasRover() {
        return this.hasRover;
    }

    public double getThrustPower() { return thrustPower; }

    public double getFuelCapacity() { return fuelCapacity; }
}
