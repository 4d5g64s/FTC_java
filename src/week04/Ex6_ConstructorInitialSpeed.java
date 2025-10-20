// Exercise 6: Constructor with parameter to initialize state
// Concept: Constructors set up default values when we create an object.
public class Ex6_ConstructorInitialSpeed {
    static class SimpleRobot {
        double speed;
        boolean turboMode;

        // Constructor assigns a starting speed
        public SimpleRobot(double initialSpeed) {
            speed = initialSpeed;
            System.out.println("Starting speed set to " + speed);
        }
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot(0.6); // Pass initial speed
    }
}
