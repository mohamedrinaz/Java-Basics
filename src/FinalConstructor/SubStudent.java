package FinalConstructor;

public class SubStudent extends Student{
    public String stNameID;

    public SubStudent() {
        super();
    }
    public SubStudent(String stName,int ID, String stNameID) {
        super(stNameID,ID);
        //this.stNameID = stNameID;
        System.out.println(stNameID);
    }

    public void studentInfo() {
        System.out.println("Student databases");
    }
}

