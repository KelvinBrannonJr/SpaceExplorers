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


}
