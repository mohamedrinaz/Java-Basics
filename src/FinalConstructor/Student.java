package FinalConstructor;

public class Student {
    public String stName;
    public int ID;
    public Student() {
        System.out.println("From Student Constructor");
    }
    public Student(String stName) {
        this.stName = stName;
        System.out.println("From SubStudent Constructor");
    }
    public Student(String stName, int ID) {
        this.stName = stName;
        this.ID = ID;
        System.out.println("From SubStudent Constructor");
    }

}