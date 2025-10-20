// Exercise 16: Final challenge with class methods and looped actions
// Concept: Object with state (ammo) manipulated by methods fire() and reload().
public class Ex16_LauncherChallenge {
    static class Launcher {
        int ammo = 5; // Remaining shots

        public void fire() {
            if (ammo > 0) {
                System.out.println("Bang!");
                ammo--; // Reduce ammo when firing
            } else {
                System.out.println("Out of ammo! Reload!");
            }
        }

        public void reload() {
            ammo = 5; // Reset to full
            System.out.println("Reloaded.");
        }
    }

    public static void main(String[] args) {
        Launcher l = new Launcher();
        for (int i = 0; i < 6; i++) l.fire(); // 6th call should warn
        l.reload();
        l.fire();
    }
}
