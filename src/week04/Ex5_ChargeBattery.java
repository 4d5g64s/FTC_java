// Exercise 5: Add a method that changes a field
// Concept: Methods can update internal state (here, recharge the battery).
public class Ex5_ChargeBattery {
    static class SimpleRobot {
        double batteryLevel = 42.0; // start partially charged

        // Method to modify the field in a controlled way
        public void chargeBattery() {
            batteryLevel = 100.0;
            System.out.println("Battery fully charged.");
        }
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        System.out.println("Before: " + robot.batteryLevel);
        robot.chargeBattery(); // call method
        System.out.println("After: " + robot.batteryLevel);
    }
}
