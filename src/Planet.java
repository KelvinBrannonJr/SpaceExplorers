public class Planet {

    // Planet Private members
    private String planetName;
    private int planetMass;

    // Planet Types Enum
    public enum PlanetTypes {
        DEFAULT("Default"),
        ROCKY("Rocky"),
        LIQUID("Liquid"),
        GASEOUS("Gaseous"),
        CRYSTALLINE("Crystalline");

        private String planetTypes;

        PlanetTypes(String plTypes) {
            this.planetTypes = plTypes;
        }

        public String getPlanetTypes() {
            return planetTypes;
        }
    }

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
        PlanetTypes plType = PlanetTypes.DEFAULT;
        this.hasAtmosphere = false;
        this.atmosphereTemp = 0.0;
        this.hasSurface = false;
        this.surfaceTemp = 0.0;
        this.abundantResource = "None";
        this.isHabitableForHumans = false;
    }

    public Planet(String planetName, int planetMass, PlanetTypes plType, boolean hasAtmosphere, double atmosphereTemp,
            boolean hasSurface, double surfaceTemp, String abundantResource, boolean isHabitableForHumans) {
        this.planetName = planetName;
        this.planetMass = planetMass;
        PlanetTypes planetType = plType;
        this.hasAtmosphere = hasAtmosphere;
        this.atmosphereTemp = atmosphereTemp;
        this.hasSurface = hasSurface;
        this.surfaceTemp = surfaceTemp;
        this.abundantResource = abundantResource;
        this.isHabitableForHumans = isHabitableForHumans;
    }

}
