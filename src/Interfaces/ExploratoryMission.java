package Interfaces;

public interface ExploratoryMission {
    public String selectDestinationPlanet(String dest);
    public String selectOriginPlanet(String originPlanetName);
    public double calculateDistance(double originPos, double destinationPos);
    public double travel(double shuttleThrustPower, double calculatedDistance);
    public void arrivalToPlanet(String destinationPlanet);
    public void landOnSurface(boolean land, String planetName);
    public void gatherResources(String resource);

}
