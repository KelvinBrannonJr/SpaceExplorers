public class Planet {

    // Planet Private members
    private String planetName;
    private int planetMass;

    private PlanetTypes planetTypes;

    // Planet Types Enum
    public enum PlanetTypes { DEFAULT, ROCKY, LIQUID, GASEOUS, CRYSTALLINE }

    private boolean hasAtmosphere;

    private double atmosphereTemp;

    private boolean hasSurface;

    private double surfaceTemp;

    private String abundantResource;

    private boolean isHabitableForHumans;

    // Planet Constructors
    public Planet() {
        this.planetName = "None";
        this.planetMass = 0;
        this.planetTypes = PlanetTypes.DEFAULT;
        this.hasAtmosphere = false;
        this.atmosphereTemp = 0.0;
        this.hasSurface = false;
        this.surfaceTemp = 0.0;
        this.abundantResource = "None";
        this.isHabitableForHumans = false;
    }

    public Planet(String planetName, int planetMass, PlanetTypes planetType, boolean hasAtmosphere, double atmosphereTemp,
            boolean hasSurface, double surfaceTemp, String abundantResource, boolean isHabitableForHumans) {
        this.planetName = planetName;
        this.planetMass = planetMass;
        this.planetTypes = planetType;
        this.hasAtmosphere = hasAtmosphere;
        this.atmosphereTemp = atmosphereTemp;
        this.hasSurface = hasSurface;
        this.surfaceTemp = surfaceTemp;
        this.abundantResource = abundantResource;
        this.isHabitableForHumans = isHabitableForHumans;
    }

    // Planet Setters
    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setPlanetMass(int planetMass) {
        this.planetMass = planetMass;
    }

    public void setPlanetTypes(PlanetTypes planetTypes) {
        this.planetTypes = planetTypes;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public void setAtmosphereTemp(double atmosphereTemp) {
        this.atmosphereTemp = atmosphereTemp;
    }

    public void setHasSurface(boolean hasSurface) {
        this.hasSurface = hasSurface;
    }

    public void setAbundantResource(String abundantResource) {
        this.abundantResource = abundantResource;
    }

    public void setHabitableForHumans(boolean isHabitableForHumans) {
        this.isHabitableForHumans = isHabitableForHumans;
    }
}
