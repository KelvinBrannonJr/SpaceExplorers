public class Rover {

    // Rover private members
    private String roverName;
    private double batteryRange;
    private boolean hasSolarCharger;
    private SensorTypes sensorTypes;

    private MobilityTypes mobilityTypes;


    // Rover SensorType Enum
    public enum SensorTypes { DEFAULT, DOPPLER, INFERRED, MICROBIAL, SEISMIC }

    // Rover MobilityType Enum
    public enum MobilityTypes { DEFAULT, DRIVING, FLYING, SUBMERSIBLE }


    // Rover Constructors
    public Rover() {
        this.roverName = "None";
        this.batteryRange = 0.0;
        this.hasSolarCharger = false;
        this.sensorTypes = SensorTypes.DEFAULT;
        this.mobilityTypes = MobilityTypes.DEFAULT;
    }

    public Rover(String roverName, double batteryRange, boolean hasSolarCharger, SensorTypes sensor, MobilityTypes mobilityTypes) {
        this.roverName = roverName;
        this.batteryRange = batteryRange;
        this.hasSolarCharger = hasSolarCharger;
        this.sensorTypes = sensor;
        this.mobilityTypes = mobilityTypes;

    }

    // Rover Setters
    public void setRoverName(String roverName) {
        this.roverName = roverName;
    }

    public void setBatteryRange(double batteryRange) {
        this.batteryRange = batteryRange;
    }

    public void setHasSolarCharger(boolean hasSolarCharger) {
        this.hasSolarCharger = hasSolarCharger;
    }

    public void setSensorTypes(SensorTypes sensorTypes) { this.sensorTypes = sensorTypes; }

    public void setMobilityTypes(MobilityTypes mobilityTypes) { this.mobilityTypes = mobilityTypes; }

    // Rover Getters
    public String getRoverName() {
        return this.roverName;
    }

    public double getBatteryRange() {
        return this.batteryRange;
    }

    public boolean getHasSolarCharger() {
        return this.hasSolarCharger;
    }

    public SensorTypes getSensorTypes() { return sensorTypes; }

    public MobilityTypes getMobilityTypes() { return mobilityTypes; }
}
