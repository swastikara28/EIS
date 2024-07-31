import java.util.HashMap;
import java.util.Map;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    public String addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            return "Classroom " + className + " has been created.";
        } else {
            return "Classroom " + className + " already exists.";
        }
    }

    public String addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.addStudent(studentId);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }

    public String scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.scheduleAssignment(assignmentDetails);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }

    public String submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            return classroom.submitAssignment(studentId, assignmentDetails);
        } else {
            return "Classroom " + className + " does not exist.";
        }
    }
}
