package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    // Constructor
    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}