import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Astronaut {
    // Astronaut public member
    public final int AGE_LIMIT = 65;


    // Astronaut private members
    private String astronautName;
    private int astronautAge;
    private String astronautRank;
    private String homeCountry;
    private String uniqueSkill;
    private String shuttleName;

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

    // toString method
    @Override
    public String toString() {
        return "Name: " + astronautName +" | Age: "+ astronautAge +" | Rank: "+ astronautRank +" | Home Country: "+ homeCountry +" | Skill: "+ uniqueSkill +" | Original Shuttle: "+ shuttleName;
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

    // Astronaut Utility Methods
    public Astronaut createUserAstronaut() {
        Astronaut userAstronaut = new Astronaut();

        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome, create your Astronaut Character:");

        System.out.println("Enter your full name.");
        String fullName = scn.nextLine();
        userAstronaut.setAstronautName(fullName);

        System.out.println("What is your age?");
        int age = scn.nextInt();
        if (age > AGE_LIMIT) {
            System.out.println("Despite the great John Glenn, space is too hazardous for that age.. system will auto-cap at 65yrs old instead.");
            age = AGE_LIMIT;
        }
        userAstronaut.setAstronautAge(age);
        scn.nextLine();

        System.out.println("Enter your Crewman Rank.");
        String rank = scn.nextLine();
        userAstronaut.setAstronautRank(rank);

        System.out.println("What is your home country?");
        String country = scn.nextLine();
        userAstronaut.setHomeCountry(country);

        System.out.println("What is your specialized skill?");
        String skill = scn.nextLine();
        userAstronaut.setUniqueSkill(skill);

        System.out.println("What is your original shuttle name?");
        String originalShuttle = scn.nextLine();
        userAstronaut.setShuttleName(originalShuttle);

        System.out.println("Welcome " + userAstronaut.getAstronautRank() + " " + userAstronaut.getAstronautName() + "!");

        return userAstronaut;
    }

}
