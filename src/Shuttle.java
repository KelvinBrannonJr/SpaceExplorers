import Interfaces.ExploratoryMission;

import java.util.HashSet;
import java.util.Set;

public class Shuttle implements ExploratoryMission {

    // Shuttle private members
    private String shuttleName;
    private String countryOrigin;
    private String researchPurpose;
    private int numOfRooms;
    private boolean hasRover;
    private double thrustPower;
    private double fuelCapacity;
    private Set<Astronaut> crew = new HashSet<>();


    // Default Shuttle Constructors
    public Shuttle() {
        this.shuttleName = "Shuttle Unknown";
        this.countryOrigin = "No Country";
        this.researchPurpose = "Research Purpose Unknown";
        this.numOfRooms = 0;
        this.hasRover = false;
        this.thrustPower = 0.0;
        this.fuelCapacity = 0.0;
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
    }

    // Object toString() method
    @Override
    public String toString() {
        System.out.println();
        return "Shuttle Name: " + shuttleName +
                " | Country of Origin: " + countryOrigin +
                " | Research Purpose: " + researchPurpose +
                " | Number of Rooms: " + numOfRooms +
                " | Rover Equipped: " + hasRover +
                " | Thrust Power: " + thrustPower +
                " | Fuel Capacity: " + fuelCapacity;
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

    public void setCrew(Set<Astronaut> crew) {
        this.crew = crew;
    }

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

    public Set<Astronaut> getCrew() {
        return this.crew;
    }

    // Shuttle Utility Methods
    public void addCrewPerson(Astronaut astronaut) {
        this.crew.add(astronaut);
    }

    public void printCrew() {
        crew.forEach(astronaut -> {
            System.out.println(astronaut.toString());
            System.out.println();
        });
    }

    public void boardShuttle(Set<Astronaut>shuttleCrew, Shuttle shuttle) {
        shuttleCrew.forEach(astronaut -> {
            System.out.println(astronaut.getAstronautName() + " boarding " + shuttle.getShuttleName());
        });
    }

    public void orbitObject(String planetName) {
        System.out.println("Orbiting " + planetName);
    }

    public boolean isSafeToLand(Planet planet) {
        if (planet.getHasSurface() && planet.getSurfaceTemp() < 250.0) {
            System.out.println("Planet environment is stable to land shuttle");
            return true;
        }
        else {
            System.out.println("Planet environment is too harsh to land shuttle");
            return false;
        }
    }
    public void landOnSurface(boolean land, String planetName) {
        if(land) {
            System.out.println("Landing on Planet " + planetName);
        }
        else {
            System.out.println("Landing protocol on Planet " + planetName + " denied..");
        }
    }

    public void deployRover(boolean hasRover) {
        System.out.println("Deploying shuttle's rover unit");
    }

    // ExploratoryMission Interface Methods
    @Override
    public String selectDestinationPlanet(String dest) {
        System.out.println();
        System.out.println("Shuttle crew has entered " + dest + " as destination planet.");
        return dest;
    }

    @Override
    public String selectOriginPlanet(String originPlanetName) {
        System.out.println();
        System.out.println("Shuttle crew has entered " + originPlanetName + " as origin planet");
        return originPlanetName;
    }

    @Override
    public double calculateDistance(double originPos, double destinationPos) {
        return destinationPos - originPos;
    }

    @Override
    public void gatherResources(String resource) {
        System.out.println("Harvesting resource " + resource);
    }

    @Override
    public void travel(double shuttleThrustPower, double calculatedDistance) {
        double time = Math.round((Math.round(calculatedDistance / shuttleThrustPower) / 24.0) / 365);
        System.out.println();
        System.out.println("Shuttle speed " + shuttleThrustPower + " MPH");
        System.out.println("Estimated shuttle travel time: " + time + " years");
    }
}
