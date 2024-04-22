package Interfaces;


// Physics Interface
public interface Physics {
    public double plotDistance(double home, double destination);
    public int timeCounter(int time);
    public void lightSpeed(double distance, int time);
    public String objectToOrbit(String obj);
    public void orbit();
    public double objectRotation(double rotate);

}
