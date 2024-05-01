import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the full name of the first crew member.");
        String fullName = scn.nextLine();
        Astronaut firstMember = new Astronaut();
        firstMember.setAstronautName(fullName);
        System.out.println(firstMember.getAstronautName());

    }
}