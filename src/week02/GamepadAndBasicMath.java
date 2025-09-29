package week02;

/**
 * B. Gamepad and Basic Math
 * Practice exercises for simulating gamepad inputs and performing basic math operations
 */
public class GamepadAndBasicMath {
    public static void main(String[] args) {
        System.out.println("=== B. Gamepad and Basic Math ===\n");

        // Exercise 1: Simulate rightTrigger = 0.7 and print a throttle percentage
        System.out.println("Exercise 1: Right trigger throttle");
        double rightTrigger = 0.7;
        System.out.println("Throttle = " + (rightTrigger * 100) + "%");
        System.out.println();

        // Exercise 2: Simulate aButton = false and print a status
        System.out.println("Exercise 2: A button status");
        boolean aButton = false;
        System.out.println("Jump? " + aButton);
        System.out.println();

        // Exercise 3: Compute horizontal speed from leftStickX
        System.out.println("Exercise 3: Horizontal speed calculation");
        double leftStickX = -0.3;
        System.out.println("Horizontal speed = " + (leftStickX * 2));
        System.out.println();

        // Exercise 4: Find the difference between leftStickY and rightStickY
        System.out.println("Exercise 4: Stick difference");
        double leftStickY = -0.5;
        double rightStickY = 0.2;
        System.out.println("Stick difference = " + (leftStickY - rightStickY));
        System.out.println();

        // Exercise 5: Compute total thrust from triggers
        System.out.println("Exercise 5: Total thrust");
        double leftTrigger = 0.4;
        double rightTrigger2 = 0.6;
        System.out.println("Total thrust = " + (leftTrigger + rightTrigger2));
        System.out.println();

        // Exercise 6: Increment a counter three times
        System.out.println("Exercise 6: Counter increment");
        int counter = 0;
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        System.out.println();

        // Exercise 7: Compute percent speed from leftStickY
        System.out.println("Exercise 7: Percent speed with validation");
        double stick = -0.8;
        if (stick >= -1 && stick <= 1) {
            double speed = stick * 100;
            System.out.println("Speed = " + speed + "%");
        }
        System.out.println();
    }
}
