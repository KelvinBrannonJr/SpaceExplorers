public class Rover {

    private String roverName;
    private double batteryRange;
    private boolean hasSolarCharger;

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

}
