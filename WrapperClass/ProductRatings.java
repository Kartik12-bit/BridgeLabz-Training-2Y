import java.util.ArrayList;
import java.util.Objects;

public class ProductRatings {
    public static void main(String[] args) {

        int[] oldRatings = {4, 5, 3, 5};  
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> all = new ArrayList<>();

        for (int r : oldRatings) {
            all.add(r);
        }

        for (Integer r : newRatings) {
            if (Objects.nonNull(r)) {
                all.add(r);
            }
        }

        int sum = 0;
        for (int x : all) {
            sum += x;
        }

        double avg = (double) sum / all.size();

        System.out.println("Average rating = " + avg);
    }
}
    