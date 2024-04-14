public class Shuttle {

    // Shuttle private members
    private String shuttleName;
    private String countryOrigin;
    private String researchType;
    private int numOfRooms;
    private boolean hasRover;

    // Default Shuttle Constructors
    public Shuttle() {
        this.shuttleName = "Shuttle Unknown";
        this.countryOrigin = "No Country";
        this.researchType = "Research Unknown";
        this.numOfRooms = 0;
        this.hasRover = false;
    }

    // Overloaded Shuttle Constructor
    public Shuttle(String name, String origin, String research, int roomNums, boolean hasRov) {
        this.shuttleName = name;
        this.countryOrigin = origin;
        this.researchType = research;
        this.numOfRooms = roomNums;
        this.hasRover = hasRov;
    }

    // Shuttle Setters
    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public void setResearchType(String researchType) {
        this.researchType = researchType;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setHasRover(boolean hasRover) {
        this.hasRover = hasRover;
    }

    // Shuttle Getters
    public String getShuttleName() {
        return this.shuttleName;
    }

    public String getCountryOrigin() {
        return this.countryOrigin;
    }

    public String getResearchType() {
        return this.researchType;
    }

    public int getNumOfRooms() {
        return this.numOfRooms;
    }

    public boolean getHasRover() {
        return this.hasRover;
    }
}
