import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService stdService = new StudentService(); // Fixed: added type name

    // Entry point - starts the app loop
    public void startApp() {
        while (true) {
            showMenu(); // Fixed: call menu inside the loop
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    stdService.viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Fixed: renamed ShoeMenu -> showMenu, fixed \n escape
    private void showMenu() {
        System.out.println("\n .....Student Management System.......");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Exit");
        System.out.print("Enter Your Choice: ");
    }

    // Handles reading student input and calling the service
    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter Attendance (0-100): ");
        int attendance = sc.nextInt();
        System.out.print("Enter Fees: ");
        double fees = sc.nextDouble();

        Student std = new Student(id, name, marks, attendance, fees);
        try {
            stdService.addStudent(std);
        } catch (InvalidStudentDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
