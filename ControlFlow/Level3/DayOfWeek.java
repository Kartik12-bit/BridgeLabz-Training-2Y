public class DayOfWeek {

    public static void main(String[] args) {
        // Check if exactly three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse command-line arguments to integer variables
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Validate the input date
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1) {
            System.out.println("Invalid date. Please enter a valid month, day, and year.");
            return;
        }
        
        // Apply the formulas to calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println("The day of the week is: " + d0);
    }
}