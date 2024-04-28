import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void setRoverName() {
        Rover rover = new Rover();
        rover.setRoverName("testRover");
        assertTrue(rover.getRoverName().equals("testRover"));
    }

    @Test
    void setBatteryRange() {
        Rover rover = new Rover();
        rover.setBatteryRange(45.0);
        assertTrue(rover.getBatteryRange() == 45.0);
    }

    @Test
    void setHasSolarCharger() {
        Rover rover = new Rover();
        rover.setHasSolarCharger(false);
        assertFalse(rover.getHasSolarCharger());
    }

    @Test
    void setSensorTypes() {
        Rover rover = new Rover();
        rover.setSensorTypes(Rover.SensorTypes.DEFAULT);
        assertTrue(rover.getSensorTypes() == Rover.SensorTypes.DEFAULT);
    }

    @Test
    void setMobilityTypes() {
        Rover rover = new Rover();
        rover.setMobilityTypes(Rover.MobilityTypes.DEFAULT);
        assertTrue(rover.getMobilityTypes() == Rover.MobilityTypes.DEFAULT);
    }

    @Test
    void getRoverName() {
        Rover rover = new Rover();
        rover.setRoverName("testRover");
        assertTrue(rover.getRoverName().equals("testRover"));
    }

    @Test
    void getBatteryRange() {
        Rover rover = new Rover();
        rover.setBatteryRange(100.0);
        assertTrue(rover.getBatteryRange() == 100.0);
    }

    @Test
    void getHasSolarCharger() {
        Rover rover = new Rover();
        rover.setHasSolarCharger(true);
        assertTrue(rover.getHasSolarCharger());
    }

    @Test
    void getSensorTypes() {
        Rover rover = new Rover();
        rover.setSensorTypes(Rover.SensorTypes.DOPPLER);
        assertTrue(rover.getSensorTypes() == Rover.SensorTypes.DOPPLER);
    }

    @Test
    void getMobilityTypes() {
        Rover rover = new Rover();
        rover.setMobilityTypes(Rover.MobilityTypes.FLYING);
        assertTrue(rover.getMobilityTypes() == Rover.MobilityTypes.FLYING);
    }
}