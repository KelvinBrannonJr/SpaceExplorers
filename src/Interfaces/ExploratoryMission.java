package Interfaces;

public interface ExploratoryMission {

    public void selectDestination(String dest);
    public void calculateDistance(int home, int destination);
    public void isSafeToLand(Object obj);

    public void landOnSurface();
    public void deployRover(boolean hasShuttleRover);
    public void gatherResources();
    public void returnHome();
}
