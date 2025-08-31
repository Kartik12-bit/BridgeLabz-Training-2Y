/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/

import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static void main(String[] args) {
        int size = 10;
        int[] otps = new int[size];

        // Generate 10 OTPs
        for (int i = 0; i < size; i++) {
            otps[i] = generateSixDigitOTP();
        }

        // Display the OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("OTP numbers are not unique.");
        }
    }

    // Generate a 6-digit OTP using Math.random()
    public static int generateSixDigitOTP() {
        // Generate random number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }

    // Check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            // If set already contains otp, not unique
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}
