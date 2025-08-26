public class Pen {
    public static void main(String[] args) {
        // variable declaration
        int totalPens = 14;
        int students = 3;
        // calculation for pens per student and remaining pens
        int pensPerStudent = totalPens / students;  
        int remainingPens = totalPens % students;   
        // output 
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
