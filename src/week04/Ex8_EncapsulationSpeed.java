// Exercise 8: Encapsulation with private field and getter/setter
// Concept: Make fields private and expose controlled access through methods.
public class Ex8_EncapsulationSpeed {
    static class SimpleRobot {
        private double speed; // hidden from outside the class

        // Setter validates/clamps the input range to [-1, 1]
        public void setSpeed(double s) {
            if (s < -1.0) s = -1.0;
            if (s >  1.0) s =  1.0;
            speed = s;
        }

        // Getter provides read-only access
        public double getSpeed() {
            return speed;
        }
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        robot.setSpeed(1.2); // will be clamped to 1.0
        System.out.println("Speed: " + robot.getSpeed());
    }
}
