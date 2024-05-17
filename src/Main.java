import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create Astronaut Objects
        Astronaut astronaut1 = new Astronaut("Blake Johnson",25, "Candidate", "America", "Hvac Systems", "Emergence");
        Astronaut astronaut2 = new Astronaut("Aiko Takahasi",37, "Astronaut", "Japan", "Atmospheric Chemist", "Hinoki");
        Astronaut astronaut3 = new Astronaut("Oliver Thompson",51, "Astronaut", "Britain", "Guidance Systems", "Belfast");
        Astronaut astronaut4 = new Astronaut();
        astronaut4 = astronaut4.createUserAstronaut();

        // Instantiate Shuttle object and add each Astronaut to the crew collection from Shuttle
        Shuttle arwing = new Shuttle("Arwing","United States","Exploration",6,true,8575.0,100.0);

        arwing.addCrewPerson(astronaut1);
        arwing.addCrewPerson(astronaut2);
        arwing.addCrewPerson(astronaut3);
        arwing.addCrewPerson(astronaut4);

        // Print crew info
        arwing.printCrew();

        // Print Shuttle info
        System.out.println(arwing.toString());

        // Board Astronaut crew on Shuttle
        arwing.boardShuttle(arwing.getCrew(),arwing);

        Planet earth = new Planet("Earth", 5.97, 9.8, 0, Planet.PlanetTypes.TERRESTRIAL, true, 15, true, 15, "Water", true);
        System.out.println(earth.toString());
    }
}