// Exercise 11: Encapsulate multiple fields and validate inputs
// Concept: Keep fields private; use getters/setters to control access.
public class Ex11_EncapsulateAll {
    static class SimpleRobot {
        private double speed;
        private boolean turboMode;
        private double batteryLevel;

        public SimpleRobot() {
            speed = 0.0;
            turboMode = false;
            batteryLevel = 100.0;
        }

        public double getSpeed() { return speed; }
        public void setSpeed(double s) {
            if (s < -1) s = -1;
            if (s > 1) s = 1;
            speed = s;
        }

        public boolean isTurboMode() { return turboMode; }
        public void setTurboMode(boolean t) { turboMode = t; }

        public double getBatteryLevel() { return batteryLevel; }
        public void setBatteryLevel(double b) {
            batteryLevel = (b < 0) ? 0 : (b > 100 ? 100 : b);
        }
    }

    public static void main(String[] args) {
        SimpleRobot robot = new SimpleRobot();
        robot.setSpeed(0.9);
        robot.setTurboMode(true);
        robot.setBatteryLevel(85);
        System.out.println(robot.getSpeed() + ", " + robot.isTurboMode() + ", " + robot.getBatteryLevel());
    }
}
