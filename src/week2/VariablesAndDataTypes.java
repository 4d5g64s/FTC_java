package week2;

/**
 * A. Variables and Data Types
 * Practice exercises for declaring variables and understanding Java data types
 */
public class VariablesAndDataTypes {
    public static void main(String[] args) {
        System.out.println("=== A. Variables and Data Types ===\n");

        // Exercise 1: Declare an int variable for age and print it
        System.out.println("Exercise 1: Age variable");
        int age = 16;
        System.out.println(age);
        System.out.println();

        // Exercise 2: Declare a boolean variable for "had breakfast" and print it
        System.out.println("Exercise 2: Boolean variable");
        boolean hadBreakfast = true;
        System.out.println("Had breakfast? " + hadBreakfast);
        System.out.println();

        // Exercise 3: Declare a double for exam score 87.5 and print it
        System.out.println("Exercise 3: Double variable");
        double score = 87.5;
        System.out.println("Score: " + score);
        System.out.println();

        // Exercise 4: Declare a String variable for your name and print "Hello XXX"
        System.out.println("Exercise 4: String variable");
        String name = "Alice";
        System.out.println("Hello " + name);
        System.out.println();

        // Exercise 5: Declare three variables and print the date
        System.out.println("Exercise 5: Multiple variables for date");
        int year = 2025;
        String month = "September";
        int day = 29;
        System.out.println("Today is " + year + "-" + month + "-" + day);
        System.out.println();

        // Exercise 6: Combine an int and String when printing
        System.out.println("Exercise 6: Combining int and String");
        System.out.println("Team: " + 16072);
        System.out.println();
    }
}
