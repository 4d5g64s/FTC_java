package week03;
// Plain Java simulation of FTC's ConceptScanServo sample.
// No FTC SDK required. Run in any Java environment (e.g., terminal, Replit).
// This mirrors the official sample's behavior: scan a servo from MIN to MAX and back,
// incrementing position in small steps and printing "telemetry" to the console.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServoScanSim {

    // ====== 1) Constants (mirroring the FTC sample) ======
    // How much to move the servo each cycle (smaller = smoother)
    static final double INCREMENT = 0.01;

    // Cycle time in milliseconds (how often we update the servo)
    static final int CYCLE_MS = 50;

    // Servo motion bounds (0.0..1.0 in FTC)
    static final double MAX_POS = 1.0;
    static final double MIN_POS = 0.0;

    // ====== 2) A tiny "Servo" simulator (no hardware needed) ======
    // In the FTC SDK you'd use: com.qualcomm.robotcore.hardware.Servo
    // Here we just clamp a double to [0.0, 1.0] and print values.
    static class ServoSim {
        private double position = 0.5; // start mid-range

        public void setPosition(double pos) {
            // Clamp to [0, 1] to emulate FTC Servo behavior
            if (pos < 0.0) pos = 0.0;
            if (pos > 1.0) pos = 1.0;
            this.position = pos;
        }

        public double getPosition() {
            return position;
        }
    }

    public static void main(String[] args) throws Exception {
        // ====== 3) Setup (equivalent to hardwareMap.get + init) ======
        ServoSim left_hand = new ServoSim(); // name matches the FTC sample ("left_hand")

        // Tracking variables from the FTC example
        double position = (MAX_POS - MIN_POS) / 2.0; // start in the middle
        boolean rampUp = true;                        // start by increasing position

        // Optional: simple console control (press 'q' + Enter to quit)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ServoScanSim started. Type 'q' + Enter to quit. Otherwise it will keep scanning.");

        // ====== 4) Loop (equivalent to while(opModeIsActive())) ======
        while (true) {

            // a) Set the servo to the current target "position"
            left_hand.setPosition(position);

            // b) "Telemetry" (like Driver Station): print current info
            System.out.printf("Telemetry | Target: %.2f | ServoPos: %.2f | rampUp: %s%n",
                              position, left_hand.getPosition(), rampUp ? "UP" : "DOWN");

            // c) Update "position" for the next cycle, flipping direction at the bounds
            if (rampUp) {
                position += INCREMENT;
                if (position >= MAX_POS) { // Hit upper bound → go down next
                    position = MAX_POS;
                    rampUp = false;
                }
            } else {
                position -= INCREMENT;
                if (position <= MIN_POS) { // Hit lower bound → go up next
                    position = MIN_POS;
                    rampUp = true;
                }
            }

            // d) Timing (equivalent to sleep(CYCLE_MS) in LinearOpMode)
            try {
                Thread.sleep(CYCLE_MS);
            } catch (InterruptedException ie) {
                // ignore in this simple demo
            }

            // e) Non-blocking console check for 'q' to quit
            try {
                if (br.ready()) {
                    String line = br.readLine();
                    if (line != null && line.trim().equalsIgnoreCase("q")) {
                        System.out.println("Quitting ServoScanSim.");
                        break;
                    }
                }
            } catch (IOException ioe) {
                // ignore read issues in this simple demo
            }
        }
    }
}
