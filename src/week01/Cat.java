package week01;

// Cat now extends Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
