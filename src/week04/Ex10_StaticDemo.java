// Exercise 10: static methods and constants
// Concept: static members belong to the class (no object needed).
public class Ex10_StaticDemo {
    // Utility class with a static method
    static class MathUtil {
        public static double clamp(double v, double lo, double hi) {
            if (v < lo) return lo;
            if (v > hi) return hi;
            return v;
        }
    }

    // Class with a static constant used by all objects
    static class SimpleRobot {
        public static final double MAX_BATTERY = 100.0; // class-level constant
        double batteryLevel = 12.3;

        public void chargeBattery() {
            batteryLevel = MAX_BATTERY; // refer to static constant
            System.out.println("Battery: " + batteryLevel);
        }
    }

    public static void main(String[] args) {
        double out = MathUtil.clamp(1.5, -1, 1); // call static method via class
        System.out.println("Clamped: " + out);
        SimpleRobot r = new SimpleRobot();
        r.chargeBattery();
    }
}
