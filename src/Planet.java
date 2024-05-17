public class Planet {

    // Planet Private members
    private String planetName;
    private double planetMass;
    private double gravity;

    private int distanceFromEarth;
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
        this.planetMass = 0.0;
        this.gravity = 0.0;
        this.distanceFromEarth = 0;
        this.planetTypes = PlanetTypes.DEFAULT;
        this.hasAtmosphere = false;
        this.atmosphereTemp = 0.0;
        this.hasSurface = false;
        this.surfaceTemp = 0.0;
        this.abundantResource = "None";
        this.isHabitableForHumans = false;
    }

    public Planet(String planetName, double planetMass, double gravity, int distanceFromEarth, PlanetTypes planetType, boolean hasAtmosphere, double atmosphereTemp,
            boolean hasSurface, double surfaceTemp, String abundantResource, boolean isHabitableForHumans) {
        this.planetName = planetName;
        this.planetMass = planetMass;
        this.gravity = gravity;
        this.distanceFromEarth = distanceFromEarth;
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

    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }

    public void setGravity(double gravity) { this.gravity = gravity; }

    public void setDistanceFromEarth(int distanceFromEarth) { this.distanceFromEarth = distanceFromEarth; }

    public void setPlanetTypes(PlanetTypes planetTypes) {
        this.planetTypes = planetTypes;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    public void setAtmosphereTemp(double atmosphereTemp) { this.atmosphereTemp = atmosphereTemp; }

    public void setHasSurface(boolean hasSurface) {
        this.hasSurface = hasSurface;
    }

    public void setSurfaceTemp(double surfaceTemp) {
        this.surfaceTemp = surfaceTemp;
    }

    public void setAbundantResource(String abundantResource) {
        this.abundantResource = abundantResource;
    }

    public void setHabitableForHumans(boolean isHabitableForHumans) { this.isHabitableForHumans = isHabitableForHumans; }

    // Planet Getters
    public String getPlanetName() {
        return this.planetName;
    }

    public double getPlanetMass() {
        return this.planetMass;
    }

    public double getGravity() { return this.gravity; }

    public int getDistanceFromEarth() { return this.distanceFromEarth; }

    public PlanetTypes getPlanetTypes() {
        return this.planetTypes;
    }

    public boolean getHasAtmosphere() {
        return this.hasAtmosphere;
    }

    public double getAtmosphereTemp() {
        return this.atmosphereTemp;
    }

    public boolean getHasSurface() {
        return this.hasSurface;
    }

    public double getSurfaceTemp() { return this.surfaceTemp; }

    public String getAbundantResource() {
        return this.abundantResource;
    }

    public boolean getIsHabitableForHumans() {
        return this.isHabitableForHumans;
    }
}
