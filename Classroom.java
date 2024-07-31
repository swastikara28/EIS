import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<String> students;
    private List<String> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String addStudent(String studentId) {
        if (!students.contains(studentId)) {
            students.add(studentId);
            return "Student " + studentId + " has been enrolled in " + name + ".";
        } else {
            return "Student " + studentId + " is already enrolled in " + name + ".";
        }
    }

    public String scheduleAssignment(String assignmentDetails) {
        assignments.add(assignmentDetails);
        return "Assignment for " + name + " has been scheduled.";
    }

    public String submitAssignment(String studentId, String assignmentDetails) {
        if (students.contains(studentId)) {
            return "Assignment submitted by Student " + studentId + " in " + name + ".";
        } else {
            return "Student " + studentId + " is not enrolled in " + name + ".";
        }
    }
}