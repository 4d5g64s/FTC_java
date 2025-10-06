package week03;

import java.util.Scanner;

class ServoSim {
    private double position = 0.5;

    public void setPosition(double pos) {
        position = Math.max(0.0, Math.min(1.0, pos));
    }

    public double getPosition() {
        return position;
    }
}

public class ServoTeleOpSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServoSim servo = new ServoSim();

        System.out.println("Simulating FTC Servo Control");
        System.out.println("Commands: a=open, b=close, x=middle, q=quit");

        label:
        while (true) {
            System.out.print("Command: ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "a":
                    servo.setPosition(1.0);
                    break;
                case "b":
                    servo.setPosition(0.0);
                    break;
                case "x":
                    servo.setPosition(0.5);
                    break;
                case "q":
                    break label;
                default:
                    System.out.println("Unknown command");
                    break;
            }

            System.out.println("Servo position now: " + servo.getPosition());
        }

        System.out.println("Simulation ended.");
    }
}
