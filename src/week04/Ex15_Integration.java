// Exercise 15: Integrate multiple classes with a simple decision
// Concept: Use conditionals to coordinate DriveTrain and Intake together.
public class Ex15_Integration {
    static class DriveTrain {
        private double leftPower, rightPower;

        public void tankDrive(double left, double right) {
            leftPower  = clamp(left);
            rightPower = clamp(right);
            System.out.println("Drive -> L:" + leftPower + " R:" + rightPower);
        }

        public void stop() {
            leftPower = rightPower = 0;
            System.out.println("Drive stopped.");
        }

        private double clamp(double v) {
            return v < -1 ? -1 : (v > 1 ? 1 : v);
        }
    }

    static class Intake {
        private boolean running;
        public void start(){ running = true;  System.out.println("Intake started."); }
        public void stop(){  running = false; System.out.println("Intake stopped."); }
    }

    public static void main(String[] args) {
        boolean aButton = true; // Toggle this to false to test the other branch

        DriveTrain dt = new DriveTrain();
        Intake in = new Intake();

        if (aButton) {          // Decision drives both subsystems
            in.start();
            dt.tankDrive(0.5, 0.5);
        } else {
            in.stop();
            dt.stop();
        }
    }
}
