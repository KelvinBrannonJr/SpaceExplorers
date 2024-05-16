import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShuttleTest {

    @Test
    public void setShuttleName() {
        Shuttle shuttle = new Shuttle();
        shuttle.setShuttleName("testName");
        assertTrue(shuttle.getShuttleName().equals("testName"));
    }

    @Test
    public void setCountryOrigin() {
        Shuttle shuttle = new Shuttle();
        shuttle.setCountryOrigin("testCountry");
        assertTrue(shuttle.getCountryOrigin().equals("testCountry"));
    }

    @Test
    public void setResearchPurpose() {
        Shuttle shuttle = new Shuttle();
        shuttle.setResearchPurpose("testResearch");
        assertTrue(shuttle.getResearchPurpose().equals("testResearch"));
    }

    @Test
    public void setNumOfRooms() {
        Shuttle shuttle = new Shuttle();
        shuttle.setNumOfRooms(5);
        assertTrue(shuttle.getNumOfRooms() == 5);
    }

    @Test
    public void setHasRover() {
        Shuttle shuttle = new Shuttle();
        shuttle.setHasRover(true);
        assertTrue(shuttle.getHasRover());
    }

    @Test
    public void setThrustPower() {
        Shuttle shuttle = new Shuttle();
        shuttle.setThrustPower(50.0);
        assertTrue(shuttle.getThrustPower() == 50.0);
    }

    @Test
    public void setFuelCapacity() {
        Shuttle shuttle = new Shuttle();
        shuttle.setFuelCapacity(75.0);
        assertTrue(shuttle.getFuelCapacity() == 75.0);
    }

    @Test
    public void getShuttleName() {
        Shuttle shuttle = new Shuttle();
        shuttle.setShuttleName("testName");
        assertTrue(shuttle.getShuttleName().equals("testName"));
    }

    @Test
    public void getCountryOrigin() {
        Shuttle shuttle = new Shuttle();
        shuttle.setCountryOrigin("testCountry");
        assertTrue(shuttle.getCountryOrigin().equals("testCountry"));
    }

    @Test
    public void getResearchPurpose() {
        Shuttle shuttle = new Shuttle();
        shuttle.setResearchPurpose("testResearch");
        assertTrue(shuttle.getResearchPurpose().equals("testResearch"));
    }

    @Test
    public void getNumOfRooms() {
        Shuttle shuttle = new Shuttle();
        shuttle.setNumOfRooms(3);
        assertTrue(shuttle.getNumOfRooms() == 3);
    }

    @Test
    public void getHasRover() {
        Shuttle shuttle = new Shuttle();
        shuttle.setHasRover(false);
        assertFalse(shuttle.getHasRover());
    }

    @Test
    public void getThrustPower() {
        Shuttle shuttle = new Shuttle();
        shuttle.setThrustPower(1000.0);
        assertTrue(shuttle.getThrustPower() == 1000.0);
    }

    @Test
    public void getFuelCapacity() {
        Shuttle shuttle = new Shuttle();
        shuttle.setFuelCapacity(100.0);
        assertTrue(shuttle.getFuelCapacity() == 100.0);
    }

    @Test
    public void getCrew() {
        Shuttle shuttle = new Shuttle();
        Shuttle shuttle2 = new Shuttle();
        Astronaut astronaut = new Astronaut();

        Set<Astronaut> crew = new HashSet<>();
        Set<Astronaut> crew2 = new HashSet<>();

        shuttle.setCrew(crew);
        crew.add(astronaut);

        shuttle2.setCrew(crew2);
        crew2.add(astronaut);

        assertTrue(shuttle.getCrew().equals(shuttle2.getCrew()));
    }


}
