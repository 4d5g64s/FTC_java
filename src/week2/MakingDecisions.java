package week2;

/**
 * C. Making Decisions
 * Practice exercises for conditional statements, loops, and decision-making in Java
 */
public class MakingDecisions {
    public static void main(String[] args) {
        System.out.println("=== C. Making Decisions ===\n");

        // Exercise 1: Shoot when aButton is pressed
        System.out.println("Exercise 1: Button-triggered action");
        boolean aBtn = true;
        if (aBtn) {
            System.out.println("Shoot!");
        } else {
            System.out.println("Idle");
        }
        System.out.println();

        // Exercise 2: Warn when leftTrigger + rightTrigger > 1.5
        System.out.println("Exercise 2: Overload warning");
        double lT = 0.9;
        double rT = 0.8;
        if (lT + rT > 1.5) {
            System.out.println("Overload warning!");
        }
        System.out.println();

        // Exercise 3: Print Pass/Fail for score
        System.out.println("Exercise 3: Pass/Fail determination");
        int scoreValue = 85;
        if (scoreValue >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println();

        // Exercise 4: Temperature check
        System.out.println("Exercise 4: Temperature check with multiple conditions");
        int temperature = 30;
        if (temperature > 35) {
            System.out.println("Too hot");
        } else if (temperature < 10) {
            System.out.println("Too cold");
        } else {
            System.out.println("Just right");
        }
        System.out.println();

        // Exercise 5: Grade to score range
        System.out.println("Exercise 5: Grade to score conversion");
        String grade = "A";
        if (grade.equals("A")) {
            System.out.println("90+");
        } else if (grade.equals("B")) {
            System.out.println("80+");
        } else if (grade.equals("C")) {
            System.out.println("70+");
        }
        System.out.println();

        // Exercise 6: For loop 1..5
        System.out.println("Exercise 6: For loop countdown");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        // Exercise 7: While loop countdown
        System.out.println("Exercise 7: While loop countdown");
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n--;
        }
        System.out.println("BOOM!");
        System.out.println();

        // Exercise 8: Turbo mode with ternary operator
        System.out.println("Exercise 8: Turbo mode with ternary operator");
        boolean turboButton = true;
        double stickY = -0.5;
        double speed = turboButton ? stickY * 1.0 : stickY * 0.5;
        System.out.println("Speed = " + speed);
        System.out.println();

        // Exercise 9: Crazy mode swaps X and Y
        System.out.println("Exercise 9: Crazy mode coordinate swap");
        boolean crazy = true;
        int x = 10;
        int y = 20;
        if (crazy) {
            System.out.println("X = " + y + ", Y = " + x);
        } else {
            System.out.println("X = " + x + ", Y = " + y);
        }
        System.out.println();
    }
}
