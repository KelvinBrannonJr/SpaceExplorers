public class Rover {

    // Rover private members
    private String roverName;
    private double batteryRange;
    private boolean hasSolarCharger;

    // Rover SensorType Enum
    public enum SensorTypes {
        DEFAULT("Default"),
        DOPPLER("Doppler"),
        INFERRED("InferRed"),
        MICROBIAL("Microbial"),
        SEISMIC("Seismic");

        private String sensorTypeDesc;

        SensorTypes(String sensorTypeCode) {
            this.sensorTypeDesc = sensorTypeCode;
        }
        public String getSensorType() {
            return sensorTypeDesc;
        }
    }

    // Rover Constructors
    public void Rover() {
        this.roverName = "None";
        this.batteryRange = 0.0;
        this.hasSolarCharger = false;
        SensorTypes sensor = SensorTypes.DEFAULT;
    }

    public void Rover(String roverName, SensorTypes sensor, double batteryRange, boolean hasSolarCharger) {
        this.roverName = roverName;
        this.batteryRange = batteryRange;
        this.hasSolarCharger = hasSolarCharger;

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

}
