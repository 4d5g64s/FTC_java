// Exercise 7: Use methods on an object
// Concept: Call methods to perform actions; observe printed output.
public class Ex7_UseClassMoveCharge {
    static class SimpleRobot {
        double batteryLevel = 60.0;

        public void move(double power) {
            System.out.println("Moving at power: " + power);
        }

        public void chargeBattery() {
            batteryLevel = 100.0;
            System.out.println("Battery fully charged.");
        }
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        robot.move(0.5);     // action method
        robot.chargeBattery(); // state-changing method
    }
}
