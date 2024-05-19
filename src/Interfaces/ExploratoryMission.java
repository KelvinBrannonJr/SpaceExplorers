package Interfaces;

public interface ExploratoryMission {
    public String selectDestinationPlanet(String dest);
    public String selectOriginPlanet(String originPlanetName);
    public double calculateDistance(double originPos, double destinationPos);
    public void gatherResources(String resource);

    public void travel(double shuttleThrustPower, double calculatedDistance);
}
