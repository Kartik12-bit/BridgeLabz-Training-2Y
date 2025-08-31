/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers)
*/

public class RandomNumbersStatistics {

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display generated numbers
        System.out.print("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find average, min, max
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }

    // Method to generate an array of 'size' random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random int between 1000 and 9999 (inclusive)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    // Method to find average, min, and max of an integer array
    // Returns double array: [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }
}
