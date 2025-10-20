// Exercise 9: Design a DriveTrain with methods and private fields
// Concept: Encapsulation + helper method (clamp) inside the class.
public class Ex9_DriveTrain {
    static class DriveTrain {
        private double leftPower;
        private double rightPower;

        public void tankDrive(double left, double right) {
            leftPower = clamp(left);
            rightPower = clamp(right);
            System.out.println("Drive -> L: " + leftPower + ", R: " + rightPower);
        }

        public void stop() {
            leftPower = 0;
            rightPower = 0;
            System.out.println("Drive stopped.");
        }

        // Private utility to keep values within [-1, 1]
        private double clamp(double v) {
            if (v < -1) return -1;
            if (v > 1)  return 1;
            return v;
        }
    }

    public static void main(String[] args) {
        DriveTrain dt = new DriveTrain();
        dt.tankDrive(0.7, 0.8); // example use
        dt.stop();
    }
}
