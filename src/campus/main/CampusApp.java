package campus.main;

import campus.learners.*;
import campus.teachers.*;
import campus.divisions.*;
import static java.lang.Math.*;

public class CampusApp {
    public static void main(String[] args) {
        Learner l1 = new Learner("Kartik", 101, "AI & Data Science");
        Learner l2 = new Learner("Aditi", 102, "Software Engineering");

        Teacher t1 = new Teacher("Dr. Menon", "Operating Systems", 10);
        Teacher t2 = new Teacher("Prof. Singh", "Networking", 7);

        Division d1 = new Division("AI", 6, 120);
        Division d2 = new Division("Software", 5, 100);

        System.out.println("=== Campus Management System ===");
        System.out.println(l1.getDetails());
        System.out.println(l2.getDetails());
        System.out.println(t1.getDetails());
        System.out.println(t2.getDetails());
        System.out.println(d1.getDetails());
        System.out.println(d2.getDetails());

        double ratio = (double) d1.getDetails().length() / d2.getDetails().length();
        System.out.println("Random Ratio (using pow() example): " + pow(ratio, 2));
    }
}

