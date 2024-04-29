import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void setPlanetName() {
        Planet planet = new Planet();
        planet.setPlanetName("testName");
        assertTrue(planet.getPlanetName().equals("testName"));
    }

    @Test
    void setPlanetMass() {
        Planet planet = new Planet();
        planet.setPlanetMass(6.02e24);
        assertTrue(planet.getPlanetMass() == 6.02e24);
    }

    @Test
    void setGravity() {
        Planet planet = new Planet();
        planet.setGravity(5.9);
        assertTrue(planet.getGravity() == 5.9);
    }

    @Test
    void setPlanetTypes() {
        Planet planet = new Planet();
        planet.setPlanetTypes(Planet.PlanetTypes.DEFAULT);
        assertTrue(planet.getPlanetTypes() == Planet.PlanetTypes.DEFAULT);
    }

    @Test
    void setHasAtmosphere() {
        Planet planet = new Planet();
        planet.setHasAtmosphere(false);
        assertFalse(planet.getHasAtmosphere());
    }

    @Test
    void setAtmosphereTemp() {
        Planet planet = new Planet();
        planet.setAtmosphereTemp(80.5);
        assertTrue(planet.getAtmosphereTemp() == 80.5);
    }

    @Test
    void setHasSurface() {
        Planet planet = new Planet();
        planet.setHasSurface(true);
        assertTrue(planet.getHasSurface());
    }

    @Test
    void setSurfaceTemp() {
        Planet planet = new Planet();
        planet.setSurfaceTemp(375.5);
        assertTrue(planet.getSurfaceTemp() == 375.5);
    }

    @Test
    void setAbundantResource() {
        Planet planet = new Planet();
        planet.setAbundantResource("testResource");
        assertTrue(planet.getAbundantResource().equals("testResource"));

    }

    @Test
    void setHabitableForHumans() {
        Planet planet = new Planet();
        planet.setHabitableForHumans(true);
        assertTrue(planet.getIsHabitableForHumans());
    }

    @Test
    void getPlanetName() {
    }

    @Test
    void getPlanetMass() {
    }

    @Test
    void getGravity() {
    }

    @Test
    void getPlanetTypes() {
    }

    @Test
    void getHasAtmosphere() {
    }

    @Test
    void getAtmosphereTemp() {
    }

    @Test
    void getHasSurface() {
    }

    @Test
    void getSurfaceTemp() {
    }

    @Test
    void getAbundantResource() {
    }

    @Test
    void getIsHabitableForHumans() {
    }
}