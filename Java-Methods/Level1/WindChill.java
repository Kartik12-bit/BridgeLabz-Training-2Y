/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature and wind speed
        System.out.print("Enter the temperature (°F): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (mph): ");
        double windSpeed = scanner.nextDouble();

        // Calculate wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
    }

    // Method to calculate wind chill temperature from temp and wind speed
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
