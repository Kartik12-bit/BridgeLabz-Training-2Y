public class AgeValidator {

    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidAge("20"));  
        System.out.println(isValidAge("15"));  
        System.out.println(isValidAge("abc")); 
    }
}
