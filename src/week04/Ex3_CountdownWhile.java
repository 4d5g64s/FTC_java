// Exercise 3: Countdown using a while loop
// Concept: Repeat while a condition remains true; ensure the loop variable changes.
public class Ex3_CountdownWhile {
    public static void main(String[] args) {
        int n = 5; // Start value

        while (n > 0) { // Loop until condition becomes false
            System.out.println(n);
            n--; // Update step to avoid infinite loop
        }

        System.out.println("Launch!");
    }
}
