import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class ShuttleTest {

    @Test
    void setShuttleName() {
        Shuttle shuttle = new Shuttle();
        shuttle.setShuttleName("testName");
        assertTrue(shuttle.getShuttleName().equals("testName"));
    }

    @Test
    void setCountryOrigin() {
        Shuttle shuttle = new Shuttle();
        shuttle.setCountryOrigin("testCountry");
        assertTrue(shuttle.getCountryOrigin().equals("testCountry"));
    }

    @Test
    void setResearchPurpose() {
        Shuttle shuttle = new Shuttle();
        shuttle.setResearchPurpose("testResearch");
        assertTrue(shuttle.getResearchPurpose().equals("testResearch"));
    }

    @Test
    void setNumOfRooms() {
        Shuttle shuttle = new Shuttle();
        shuttle.setNumOfRooms(5);
        assertTrue(shuttle.getNumOfRooms() == 5);
    }

    @Test
    void setHasRover() {
        Shuttle shuttle = new Shuttle();
        shuttle.setHasRover(true);
        assertTrue(shuttle.getHasRover());
    }

    @Test
    void setThrustPower() {
        Shuttle shuttle = new Shuttle();
        shuttle.setThrustPower(50.0);
        assertTrue(shuttle.getThrustPower() == 50.0);
    }

    @Test
    void setFuelCapacity() {
        Shuttle shuttle = new Shuttle();
        shuttle.setFuelCapacity(75.0);
        assertTrue(shuttle.getFuelCapacity() == 75.0);
    }

    @Test
    void getShuttleName() {
        Shuttle shuttle = new Shuttle();
        shuttle.setShuttleName("testName");
        assertTrue(shuttle.getShuttleName().equals("testName"));
    }

    @Test
    void getCountryOrigin() {
        Shuttle shuttle = new Shuttle();

    }

    @Test
    void getResearchType() {
        Shuttle shuttle = new Shuttle();

    }

    @Test
    void getNumOfRooms() {
        Shuttle shuttle = new Shuttle();

    }

    @Test
    void getHasRover() {
        Shuttle shuttle = new Shuttle();

    }

    @Test
    void getThrustPower() {
        Shuttle shuttle = new Shuttle();

    }

    @Test
    void getFuelCapacity() {
        Shuttle shuttle = new Shuttle();

    }
}
