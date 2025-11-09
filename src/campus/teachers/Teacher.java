package campus.teachers;

public class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getDetails() {
        return "Teacher Name: " + name + ", Subject: " + subject + ", Experience: " + experience + " years";
    }
}
