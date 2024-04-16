public class Rover {

    // Rover private members
    private String roverName;
    private double batteryRange;
    private boolean hasSolarCharger;

    // Rover SensorType Enum
    public enum SensorType {
        DEFAULT("Default"),
        DOPPLER("Doppler"),
        INFERRED("InferRed"),
        MICROBIAL("Microbial"),
        SEISMIC("Seismic");

        private String sensorTypeDesc;

        SensorType(String sensorTypeCode) {
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
    }

    public void Rover(String roverName, double batteryRange, boolean hasSolarCharger) {
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

}
