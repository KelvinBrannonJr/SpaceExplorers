public class Astronaut {
    // Astronaut private members
    private String astronautName;
    private String astronautRank;
    private String homeCountry;
    private String uniqueSkill;
    private String shuttleName;


    // Default Astronaut Constructor
    public Astronaut() {
        this.astronautName = "No Name";
        this.astronautRank = "No Rank";
        this.homeCountry = "No Country of Origin";
        this.uniqueSkill = "No specialty skill";
        this.shuttleName = "No shuttle name";
    }

    // Astronaut Overloaded Constructor
    public Astronaut(String astronautName, String astronautRank, String homeCountry, String uniqueSkill, String shuttleName) {
        this.astronautName = astronautName;
        this.astronautRank = astronautRank;
        this.homeCountry = homeCountry;
        this.uniqueSkill = uniqueSkill;
        this.shuttleName = shuttleName;
    }

    // Astronaut Setters
    public void setAstronautName(String astronautName) {
        this.astronautName = astronautName;
    }

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
}
