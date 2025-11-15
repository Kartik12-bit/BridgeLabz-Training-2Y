import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges2 {
    public static void main(String[] args) {

        int[] ages = {25, 32, 28, 45, 21, 39};

        ArrayList<Integer> list = new ArrayList<>();

        for (int a : ages) {
            list.add(a);
        }

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest employee age = " + youngest);
        System.out.println("Oldest employee age = " + oldest);
    }
}
