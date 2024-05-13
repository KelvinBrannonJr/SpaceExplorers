import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create Astronaut Objects
        Astronaut astronaut1 = new Astronaut("Blake Johnson",25, "Candidate", "America", "Hvac Systems", "Emergence");
        Astronaut astronaut2 = new Astronaut("Aiko Takahasi",37, "Astronaut", "Japan", "Atmospheric Chemist", "Hinoki");
        Astronaut astronaut3 = new Astronaut("Oliver Thompson",51, "Astronaut", "Britain", "Guidance Systems", "Belfast");
        Astronaut astronaut4 = new Astronaut();
        astronaut4 = astronaut4.createUserAstronaut();

        // Add each Astronaut to the crew Set collection from Shuttle
        Shuttle arwing = new Shuttle("Arwing","United States","Exploration",6,true,8575.0,100.0);

        arwing.addCrewPerson(astronaut1);
        arwing.addCrewPerson(astronaut2);
        arwing.addCrewPerson(astronaut3);
        arwing.addCrewPerson(astronaut4);

        arwing.printCrew();
        arwing.printShuttle();
        arwing.boardShuttle(arwing.getCrew(),arwing);

    }
}