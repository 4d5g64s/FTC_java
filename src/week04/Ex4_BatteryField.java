// Exercise 4: Add and read a field from a class (no encapsulation yet)
// Concept: Fields (member variables) store state for an object.
public class Ex4_BatteryField {
    // Simple nested class for demo purposes
    static class SimpleRobot {
        double speed;               // default 0.0
        boolean turboMode;          // default false
        double batteryLevel = 100;  // initialize to 100
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();        // Create object
        System.out.println("Battery level: " + robot.batteryLevel); // Read field
    }
}
