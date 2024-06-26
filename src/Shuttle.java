import Interfaces.ExploratoryMission;
import com.google.common.util.concurrent.AtomicDouble;

import java.util.HashSet;
import java.util.Set;

public class Shuttle implements ExploratoryMission {

    public final double MAX_PLANET_TEMP = 250.0;
    public final double MIN_PLANET_TEMP = -250.0;

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
            System.out.println(astronaut.getAstronautName() + " boarding " + shuttle.getShuttleName() + ".");
        });
    }

    public boolean isDistanceTooFar(Set<Astronaut>shuttleCrew, double timeVal) {
        AtomicDouble crewCollectiveAge = new AtomicDouble();
        shuttleCrew.forEach(astronaut -> {
            crewCollectiveAge.addAndGet(astronaut.getAstronautAge());
        });
        if (crewCollectiveAge.intValue() >= timeVal) {
            System.out.println("Traveling commenced!!");
            return false;
        }
        else {
            System.out.println("Travel sequence aborted... The total age of the crew is: " + crewCollectiveAge + " years, which is less than the travel destination estimate: " + timeVal + " years.");
            return true;
        }
    }

    public void orbitObject(String planetName) {
        System.out.println("Shuttle commenced orbiting planet " + planetName + ".");
    }

    public boolean isSafeToLand(Planet planet) {
        if (planet.getHasSurface()) {
            if (planet.getSurfaceTemp() <= MAX_PLANET_TEMP && planet.getSurfaceTemp() >= MIN_PLANET_TEMP) {
                System.out.println();
                System.out.println("Planet has a surface and the environment temperature is stable enough to land the shuttle.");
                return true;
            }
            else {
                System.out.println();
                System.out.println("Planet has a surface, but the environment temperature is too harsh to land the shuttle..");
                return false;
            }
        }
        else {
            System.out.println();
            System.out.println("Planet does not have a surface to land the shuttle or deploy a rover to..");
            return false;
        }

    }

    public void deployRover(boolean hasShuttleRover) {
        System.out.println();
        System.out.println("Initiating the process of deploying the shuttle's rover unit..");
        if (hasShuttleRover) {
            System.out.println("Deployed rover unit!");
        }
        else {
            System.out.println("Sorry the shuttle is not equipped with a rover unit..");
        }
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
    public double travel(double shuttleThrustPower, double calculatedDistance) {
        double time = Math.round((Math.round(calculatedDistance / shuttleThrustPower) / 24.0) / 365);
        System.out.println();
        System.out.println("Shuttle speed " + shuttleThrustPower + " MPH");
        System.out.println("Estimated shuttle travel time: " + time + " years");
        return time;
    }

    @Override
    public void arrivalToPlanet(String destinationPlanet) {
        System.out.println();
        System.out.println("Shuttle has arrived at planet " + destinationPlanet + "!");
    }

    @Override
    public void landOnSurface(boolean land, String planetName) {
        if(land) {
            System.out.println("Landing on Planet " + planetName + ".");
        }
        else {
            System.out.println("Landing protocol on Planet " + planetName + " denied..");
        }
    }

}
