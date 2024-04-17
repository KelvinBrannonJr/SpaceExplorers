public class Rover {

    // Rover private members
    private String roverName;
    private double batteryRange;
    private boolean hasSolarCharger;
    private SensorTypes sensorTypes;


    // Rover SensorType Enum
    public enum SensorTypes { DEFAULT, DOPPLER, INFERRED, MICROBIAL, SEISMIC }


    // Rover Constructors
    public void Rover() {
        this.roverName = "None";
        this.batteryRange = 0.0;
        this.hasSolarCharger = false;
        this.sensorTypes = SensorTypes.DEFAULT;
    }

    public void Rover(String roverName, double batteryRange, boolean hasSolarCharger, SensorTypes sensor) {
        this.roverName = roverName;
        this.batteryRange = batteryRange;
        this.hasSolarCharger = hasSolarCharger;
        this.sensorTypes = sensor;

    }

    // Rover Setters
    public void setRoverName(String rovName) {
        this.roverName = rovName;
    }

    public void setBatteryRange(double batRange) {
        this.batteryRange = batRange;
    }

    public void setHasSolarCharger(boolean solarCharge) {
        this.hasSolarCharger = solarCharge;
    }

    public void setSensorTypes(SensorTypes sType) { this.sensorTypes = sType; }

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
}
