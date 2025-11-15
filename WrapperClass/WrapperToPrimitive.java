
public class WrapperToPrimitive {
    public static void main(String[] args) {

        // Given Double object
        Double obj = 45.67;

        // Converting to primitive double
        double primitiveDouble = obj.doubleValue();

        // Converting to primitive int (casting)
        int primitiveInt = (int) primitiveDouble;

        // Printing all values
        System.out.println("Wrapper Double object: " + obj);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int (after casting): " + primitiveInt);
    }
}
