// Exercise 13: Static utility with clamping
// Concept: Common math helpers belong in static utility classes.
public class Ex13_PowerScaled {
    static class Power {
        // Scale input and clamp to [-1, 1]
        public static double scaled(double input, double scale) {
            double v = input * scale;
            if (v < -1) return -1;
            if (v > 1)  return 1;
            return v;
        }
    }

    public static void main(String[] args) {
        System.out.println(Power.scaled(0.7, 2.0));  // -> 1.0
        System.out.println(Power.scaled(-0.4, 1.5)); // -> -0.6
    }
}
