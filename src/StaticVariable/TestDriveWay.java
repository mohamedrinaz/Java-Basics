package StaticVariable;

public class TestDriveWay {

    public static void main(String[] args) {

        DriveWay Mohamed = new DriveWay();
        Mohamed.driveWaySize = 10;
        System.out.println(Mohamed.driveWaySize);

        DriveWay Rinaz = new DriveWay();
        Rinaz.driveWaySize = 12;
        System.out.println(Rinaz.driveWaySize);

        System.out.println(Mohamed.driveWaySize);
    }
}
