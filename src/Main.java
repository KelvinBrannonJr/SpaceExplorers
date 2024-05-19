import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create Astronaut Objects
        Astronaut astronaut1 = new Astronaut("Blake Johnson",25, "Candidate", "America", "Hvac Systems", "Emergence");
        Astronaut astronaut2 = new Astronaut("Aiko Takahasi",37, "Astronaut", "Japan", "Atmospheric Chemist", "Hinoki");
        Astronaut astronaut3 = new Astronaut("Oliver Thompson",51, "Astronaut", "Britain", "Guidance Systems", "Belfast");
        Astronaut astronaut4 = new Astronaut();
        astronaut4 = astronaut4.createUserAstronaut();

        // Instantiate Shuttle object and display info
        Shuttle arwing = new Shuttle("Arwing","United States","Exploration",6,true,213000.0,100.0);
        System.out.println(arwing.toString());

        // Add each Astronaut to the crew collection from Shuttle
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

        // Create origin planet object and display planet info
        Planet earth = new Planet("Earth", 5.97, 9.8, 0.0, Planet.PlanetTypes.TERRESTRIAL, true, 15, true, 15, "Water", true);
        System.out.println(earth.toString());

        // Get planet name and store in origin variable
        String origin = arwing.selectOriginPlanet(earth.getPlanetName());
        double originDistance = earth.getDistanceFromEarth();

        // Create Destination planet object and display planet info
        Planet mars = new Planet("Mars", 0.642, 3.7, 140.0, Planet.PlanetTypes.TERRESTRIAL, true, -65, true, -65, "Silicon Dioxide", true);
        System.out.println(mars.toString());

        // Get planet name and store it in destination variable
        String destination = arwing.selectDestinationPlanet(mars.getPlanetName());
        double destinationDistance = mars.getDistanceFromEarth();

        // Measure distance between origin and destination planets
        double measuredDistance = arwing.calculateDistance(originDistance, destinationDistance);
        System.out.println("Distance between "  + origin + " and " + destination + " positional points: " + measuredDistance);

        // Calculate estimated time for travel between origin and destination
        arwing.travel(arwing.getThrustPower(), measuredDistance);
    }
}