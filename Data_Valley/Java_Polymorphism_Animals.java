// Base class
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Override makeSound method
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Override makeSound method
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of both derived classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Invoking the makeSound method
        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
    }
}