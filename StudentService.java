import java.util.*;

public class StudentService throws StudentDataException {
    //Collect Std obj
    private ArrayList<Student> stdli = new ArrayList<>();
    //Add objs

   public void addstd(Student std){
       stdli.add(std);
       if(std == null){
           System.out.println("Student Object is null");
       }
       if(std.getMarks()<0){
           System.out.println("Student Markes not Be negative");
       }
       if(std.getAttendance()<0 || std.getAttendance() > 100){
           System.out.println("Student Attendance must be 1 to 100");
       }
       System.out.println("Student Add Success");
   }
   public  void viewstd(){
       if(stdli.isEmpty()){
           System.out.println("Student Not Found");
       }else{
           for (Student s : stdli){
               System.out.println(s);// calls ToString Method
           }
       }
   }
}
