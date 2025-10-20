// Exercise 14: Simple class with start/stop and a status method
// Concept: Encapsulate state changes and expose a query method.
public class Ex14_Intake {
    static class Intake {
        private boolean running;

        public void start() {
            running = true;
            System.out.println("Intake started.");
        }

        public void stop() {
            running = false;
            System.out.println("Intake stopped.");
        }

        public boolean isRunning() { // 'getter' to read state
            return running;
        }
    }

    public static void main(String[] args) {
        Intake intake = new Intake();
        intake.start();
        System.out.println("Running? " + intake.isRunning());
        intake.stop();
    }
}
