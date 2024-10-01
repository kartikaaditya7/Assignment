// Product Interface
interface Animal {
    void makeSound();
}

// Concrete Products
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

// Factory Class
class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type");
        }
    }
}

// Main class
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.makeSound();

        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.makeSound();
    }
}
