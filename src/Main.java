import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kartik", 23);
        Faculty f1 = new Faculty("Mr. Sharma", "Data Structures");
        System.out.println("=== Student Details ===");
        s1.displayStudentDetails();
        System.out.println("\n=== Faculty Details ===");
        f1.displayFacultyDetails();
    }
}
