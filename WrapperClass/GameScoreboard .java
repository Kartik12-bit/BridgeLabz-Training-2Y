public class GameScoreboard {
    public static void main(String[] args) {

        Integer[] scores = {10, null, 25, 40, null, 5};

        int notPlayed = 0;
        int total = 0;

        for (Integer s : scores) {
            if (s == null) {
                notPlayed++;
            } else {
                total += s;
            }
        }

        System.out.println("Players who haven't played = " + notPlayed);
        System.out.println("Total score = " + total);
    }
}
    