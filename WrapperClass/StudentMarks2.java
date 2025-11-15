import java.util.ArrayList;

public class StudentMarks2 {
    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", 72};

        ArrayList<Integer> marks = new ArrayList<>();

        for (Object o : inputs) {
            if (o instanceof Integer) {
                marks.add((Integer) o);
            } else if (o instanceof String) {
                String s = (String) o;
                try {
                    int val = Integer.parseInt(s);
                    marks.add(val);
                } catch (Exception e) {
                }
            }
        }

        int sum = 0;
        for (int m : marks) {
            sum += m;
        }

        double avg = marks.size() > 0 ? (double) sum / marks.size() : 0;

        System.out.println("Average marks = " + avg);
    }
}
