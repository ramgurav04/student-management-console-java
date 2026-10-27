public class Student{
    private int stdID;
    private String stdName;
    private int marks;
    private int attendance;
    private double fees;

    //Default Contructor
    Student(){
    }
    //Parameterized constructor

    public Student(int stdID, String stdName, int marks, int attendance, double fees) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.marks = marks;
        this.attendance = attendance;
        this.fees = fees;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", stdName='" + stdName + '\'' +
                ", marks=" + marks +
                ", attendance=" + attendance +
                ", fees=" + fees +
                '}';
    }
}