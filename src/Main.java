import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Astronaut astronaut1 = new Astronaut("Blake Johnson",25, "Candidate", "America", "Hvac Systems", "Emergence");
        Astronaut astronaut2 = new Astronaut("Aiko Takahasi",37, "Astronaut", "Japan", "Atmospheric Chemist", "Hinoki");
        Astronaut astronaut3 = new Astronaut("Oliver Thompson",51, "Astronaut", "Britain", "Guidance Systems", "Belfast");

        System.out.println("Enter the full name of the first crew member.");
        String fullName = scn.nextLine();
        Astronaut astronaut4 = new Astronaut();
        astronaut4.setAstronautName(fullName);
        System.out.println(astronaut4.getAstronautName());



    }
}