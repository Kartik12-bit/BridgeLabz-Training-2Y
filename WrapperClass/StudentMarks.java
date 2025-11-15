public class StudentMarks {
    public static void main(String[] args) {

        String s1 = "85";
        int p1 = 95;
        Integer w1 = Integer.valueOf(88);
        String s2 = "null";
        String s3 = "abc";

        Object[] inputs = {s1, p1, w1, s2, s3};

        int sum = 0;
        int count = 0;

        for (Object obj : inputs) {

            if (obj instanceof String) {
                try {
                    Integer val = Integer.parseInt((String) obj);
                    sum += val;
                    count++;
                } catch (Exception e) {
                    // skip invalid strings
                }
            }
            else if (obj instanceof Integer) {
                sum += (Integer) obj;
                count++;
            }
        }

        double avg = count == 0 ? 0.0 : (double) sum / count;

        System.out.println("Average marks = " + avg);
    }
}
    