        public class WrapperUtility {
    public static void main(String[] args) {

        int n1 = Integer.parseInt("123");
        double n2 = Double.parseDouble("3.14");
        boolean b1 = Boolean.parseBoolean("true");
        String bin = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(b1);
        System.out.println(bin);
        System.out.println(isDigit);
        System.out.println(upper);
    }
}
