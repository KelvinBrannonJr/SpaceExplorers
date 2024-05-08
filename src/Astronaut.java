import java.util.HashSet;
import java.util.Set;

public class Astronaut {
    // Astronaut private members
    private String astronautName;
    private int astronautAge;
    private String astronautRank;
    private String homeCountry;
    private String uniqueSkill;
    private String shuttleName;
    private Set<Astronaut> crew = new HashSet<>();

    // Default Astronaut Constructor
    public Astronaut() {
        this.astronautName = "No Name";
        this.astronautAge = 0;
        this.astronautRank = "No Rank";
        this.homeCountry = "No Country of Origin";
        this.uniqueSkill = "No specialty skill";
        this.shuttleName = "No shuttle name";
    }

    // Astronaut Overloaded Constructor
    public Astronaut(String astronautName,int astronautAge, String astronautRank, String homeCountry, String uniqueSkill, String shuttleName) {
        this.astronautName = astronautName;
        this.astronautAge = astronautAge;
        this.astronautRank = astronautRank;
        this.homeCountry = homeCountry;
        this.uniqueSkill = uniqueSkill;
        this.shuttleName = shuttleName;
    }

    // Astronaut Setters
    public void setAstronautName(String astronautName) {
        this.astronautName = astronautName;
    }

    public void setAstronautAge(int astronautAge) { this.astronautAge = astronautAge; }

    public void setAstronautRank(String astronautRank) {
        this.astronautRank = astronautRank;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public void setUniqueSkill(String uniqueSkill) {
        this.uniqueSkill = uniqueSkill;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    // Astronaut Getters
    public String getAstronautName() {
        return this.astronautName;
    }

    public int getAstronautAge() { return this.astronautAge; }

    public String getAstronautRank() {
        return this.astronautRank;
    }

    public String getHomeCountry() {
        return this.homeCountry;
    }

    public String getUniqueSkill() {
        return this.uniqueSkill;
    }

    public String getShuttleName() {
        return this.shuttleName;
    }

    // Astronaut Utility
    public void addCrewPerson(Astronaut astronaut) {
        this.crew.add(astronaut);
    }
    public Set<Astronaut> getCrew() {
        return crew;
    }
}
