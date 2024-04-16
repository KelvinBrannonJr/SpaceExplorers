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


}
