public class Uav {
    private String teamName;
    private int altitude;
    private boolean isTargedLocked;

    public Uav(String teamName , int altitude)
    {
        this.teamName = teamName ;
        this.altitude = altitude;
        isTargedLocked = false;
    }

    public void lockOnTarget()
    {
        isTargedLocked = true;
        System.out.println("Hedefe kitlenildi!");
    }
}
