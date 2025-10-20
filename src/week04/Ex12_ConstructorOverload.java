// Exercise 12: Overloaded constructors and input validation via setters
// Concept: Provide multiple ways to construct objects with different initial state.
public class Ex12_ConstructorOverload {
    static class SimpleRobot {
        private double speed;
        private boolean turboMode;

        public SimpleRobot() { // default constructor
            this(0.0, false);  // delegate to the other constructor
        }

        public SimpleRobot(double initialSpeed, boolean initialTurbo) {
            setSpeed(initialSpeed);  // use setter for validation/clamping
            turboMode = initialTurbo;
            System.out.println("Init speed=" + speed + ", turbo=" + turboMode);
        }

        public void setSpeed(double s) {
            if (s < -1) s = -1;
            if (s > 1) s = 1;
            speed = s;
        }
    }

    public static void main(String[] args) {
        new SimpleRobot();           // default initialization
        new SimpleRobot(0.8, true);  // customized initialization
    }
}
