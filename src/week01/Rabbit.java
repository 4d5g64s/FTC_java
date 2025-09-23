package week01;

// Rabbit extends Animal
public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    public void hop() {
        System.out.println(name + " is hopping.");
    }
}
