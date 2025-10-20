// Exercise 1: Pressure check using if/else-if/else
// Concept: Compare a double value to thresholds and branch accordingly.
public class Ex1_PressureCheck {
    public static void main(String[] args) {
        double pressure = 1.8; // Try changing to 0.5 or 2.5 to see different outputs

        // Decision tree: only one branch runs
        if (pressure > 2.0) {
            System.out.println("Too High!");
        } else if (pressure < 1.0) {
            System.out.println("Too Low!");
        } else {
            System.out.println("Normal pressure.");
        }
    }
}
