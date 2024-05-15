package Interfaces;

public interface ExploratoryMission {

    public String selectDestination(String dest);
    public int calculateDistance(int originPos, int destinationPos);
    public void gatherResources(String resource);
    public void returnHome(String originPlanetName);
}
