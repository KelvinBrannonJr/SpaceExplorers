package Interfaces;

public interface ExploratoryMission {

    public String selectDestination(String dest);
    public boolean isSafeToLand(Object obj);
    public void deployRover(boolean hasShuttleRover);
    public void gatherResources();
    public void returnHome();
}
