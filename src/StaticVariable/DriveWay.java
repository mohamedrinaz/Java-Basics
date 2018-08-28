package StaticVariable;

public class DriveWay {

    public static int driveWaySize = 10;
    public final int driveWayLocation = 5;

    public int getDriveWaySize() {
        return driveWaySize;
    }

    public void setDriveWaySize(int driveWaySize) {
        this.driveWaySize = driveWaySize;
        this.displayDriveWaySize();
    }
    public void displayDriveWaySize() {
        System.out.println(driveWayLocation);
    }

}