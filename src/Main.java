import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Astronaut astronaut1 = new Astronaut("Blake Johnson",25, "Candidate", "America", "Hvac Systems", "Emergence");
        Astronaut astronaut2 = new Astronaut("Aiko Takahasi",37, "Astronaut", "Japan", "Atmospheric Chemist", "Hinoki");
        Astronaut astronaut3 = new Astronaut("Oliver Thompson",51, "Astronaut", "Britain", "Guidance Systems", "Belfast");
        Astronaut astronaut4 = new Astronaut();

        astronaut1.addCrewPerson(astronaut1);
        astronaut2.addCrewPerson(astronaut2);
        astronaut3.addCrewPerson(astronaut3);

        System.out.println("Enter the full name of the first crew member.");
        String fullName = scn.nextLine();
        astronaut4.setAstronautName(fullName);

        System.out.println("What is your age?");
        int age = scn.nextInt();
        astronaut4.setAstronautAge(age);

        System.out.println("Enter your Rank.");
        String rank = scn.nextLine();
        astronaut4.setAstronautRank(rank);

        System.out.println("What is your home country?");
        String country = scn.nextLine();
        astronaut4.setHomeCountry(country);

        System.out.println("What is your specialized skill?");
        String skill = scn.nextLine();
        astronaut4.setUniqueSkill(skill);

        System.out.println("What is your original shuttle name?");
        String originalShuttle = scn.nextLine();
        astronaut4.setShuttleName(originalShuttle);

    }
}