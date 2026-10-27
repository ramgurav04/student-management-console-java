import java.util.*;

public class StudentService {
    // Collect Student objects
    private ArrayList<Student> stdList = new ArrayList<>();

    // Add student - validate FIRST, then add
    public void addStudent(Student std) throws InvalidStudentDataException {
        if (std == null) {
            throw new InvalidStudentDataException("Student object cannot be null");
        }
        if (std.getMarks() < 0) {
            throw new InvalidStudentDataException("Student marks cannot be negative");
        }
        if (std.getAttendance() < 0 || std.getAttendance() > 100) {
            throw new InvalidStudentDataException("Student attendance must be between 0 and 100");
        }
        stdList.add(std); // Only add if all validations pass
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (stdList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : stdList) {
                System.out.println(s); // calls toString() method
            }
        }
    }
}
