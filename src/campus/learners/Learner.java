package campus.learners;

public class Learner {
    private String name;
    private int rollNo;
    private String course;

    public Learner(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public String getDetails() {
        return "Learner Name: " + name + ", Roll No: " + rollNo + ", Course: " + course;
    }
}
