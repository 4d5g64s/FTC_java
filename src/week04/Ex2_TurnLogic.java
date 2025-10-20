// Exercise 2: Turning logic with booleans and logical operators
// Concept: Combine conditions with && (and) and use else-if chains.
public class Ex2_TurnLogic {
    public static void main(String[] args) {
        boolean leftButton = true;   // Simulated inputs
        boolean rightButton = false; // Toggle these to test all branches

        if (leftButton && rightButton) {
            System.out.println("Turn in place.");
        } else if (leftButton) {
            System.out.println("Turn left.");
        } else if (rightButton) {
            System.out.println("Turn right.");
        } else {
            System.out.println("Idle.");
        }
    }
}
