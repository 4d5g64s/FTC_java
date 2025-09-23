package week01;

// Demo program
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.eat();   // from Animal
        dog.bark();  // Dog's own method

        Cat cat = new Cat("Kitty", 2);
        cat.eat();   // from Animal
        cat.meow();  // Cat's own method

        Rabbit rabbit = new Rabbit("Fluffy", 1);
        rabbit.eat();  // from Animal
        rabbit.hop();  // Rabbit's own method
    }
}
