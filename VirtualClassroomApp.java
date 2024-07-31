import java.util.Scanner;

public class VirtualClassroomApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final VirtualClassroomManager manager = new VirtualClassroomManager();

    public static void main(String[] args) {
        displayMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        handleUserChoice(choice);
    }

    private static void displayMenu() {
        System.out.println("1. Add classroom");
        System.out.println("2. Add student");
        System.out.println("3. Schedule assignment");
        System.out.println("4. Submit assignment");
        System.out.print("Enter your choice: ");
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                addClassroom();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                scheduleAssignment();
                break;
            case 4:
                submitAssignment();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void addClassroom() {
        System.out.print("Create a new classroom\nClassroom name: ");
        String className = scanner.nextLine();
        System.out.println(manager.addClassroom(className));
    }

    private static void addStudent() {
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Classroom name: ");
        String className = scanner.nextLine();
        System.out.println(manager.addStudent(studentId, className));
    }

    private static void scheduleAssignment() {
        System.out.print("Classroom name: ");
        String className = scanner.nextLine();
        System.out.print("Assignment details: ");
        String assignmentDetails = scanner.nextLine();
        System.out.println(manager.scheduleAssignment(className, assignmentDetails));
    }

    private static void submitAssignment() {
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Classroom name: ");
        String className = scanner.nextLine();
        System.out.print("Assignment details: ");
        String assignmentDetails = scanner.nextLine();
        System.out.println(manager.submitAssignment(studentId, className, assignmentDetails));
    }
}
