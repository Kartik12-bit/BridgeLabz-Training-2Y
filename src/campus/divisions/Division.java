package campus.divisions;

public class Division {
    private String name;
    private int numOfTeachers;
    private int numOfLearners;

    public Division(String name, int numOfTeachers, int numOfLearners) {
        this.name = name;
        this.numOfTeachers = numOfTeachers;
        this.numOfLearners = numOfLearners;
    }

    public String getDetails() {
        return "Division: " + name + ", Teachers: " + numOfTeachers + ", Learners: " + numOfLearners;
    }
}

