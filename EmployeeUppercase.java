public class EmployeeUppercase {
    static void printUppercase(String name) {
        String upper = name.toUpperCase();
        System.out.println(upper);
    }

    public static void main(String[] args) {
        String[] names = {"kartik", "mukund", "abhisheik", "aditya"};
        System.out.println("Names in Uppercase:");
        for (String name : names) {
            printUppercase(name); 
        }
    }
}
 
