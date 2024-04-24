import org.junit.Test;

import static org.junit.Assert.assertTrue;;

public class AstronautTest {

        @Test
        public void setAstronautName() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautName("testName");
            assertTrue(astronaut.getAstronautName().equals("testName"));
        }

        @Test
        public void setAstronautAge() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautAge(25);
            assertTrue(astronaut.getAstronautAge() == 25);
        }

        @Test
        public void setAstronautRank() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautRank("Newbie");
            assertTrue(astronaut.getAstronautRank().equals("Newbie"));
        }

        @Test
        public void setHomeCountry() {
            Astronaut astronaut = new Astronaut();
            astronaut.setHomeCountry("testEarth");
            assertTrue(astronaut.getHomeCountry().equals("testEarth"));

        }

        @Test
        public void setUniqueSkill() {
            Astronaut astronaut = new Astronaut();
            astronaut.setUniqueSkill("testSkill");
            assertTrue(astronaut.getUniqueSkill().equals("testSkill"));
        }

        @Test
        public void setShuttleName() {
            Astronaut astronaut = new Astronaut();
            astronaut.setShuttleName("testShuttle");
            assertTrue(astronaut.getShuttleName().equals("testShuttle"));
        }

        @Test
        public void getAstronautName() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautName("testName");
            assertTrue(astronaut.getAstronautName().equals("testName"));
        }

        @Test
        public void getAstronautAge() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautAge(25);
            assertTrue(astronaut.getAstronautAge() == 25);
        }

        @Test
        public void getAstronautRank() {
            Astronaut astronaut = new Astronaut();
            astronaut.setAstronautRank("Newbie");
            assertTrue(astronaut.getAstronautRank().equals("Newbie"));
        }

        @Test
        public void getHomeCountry() {
            Astronaut astronaut = new Astronaut();
            astronaut.setHomeCountry("testEarth");
            assertTrue(astronaut.getHomeCountry().equals("testEarth"));
        }

        @Test
        public void getUniqueSkill() {
            Astronaut astronaut = new Astronaut();
            astronaut.setUniqueSkill("testSkill");
            assertTrue(astronaut.getUniqueSkill().equals("testSkill"));
        }

        @Test
        public void getShuttleName() {
            Astronaut astronaut = new Astronaut();
            astronaut.setShuttleName("testShuttle");
            assertTrue(astronaut.getShuttleName().equals("testShuttle"));
        }
}
