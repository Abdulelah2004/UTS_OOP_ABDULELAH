
//Abdulelah Ahmed
import java.util.Scanner;


class Animal {
    protected String typeSound;

    public Animal(String typeSound) {
        this.typeSound = typeSound;
    }

    public void sound() {
        System.out.println(typeSound);
    }

    public boolean isMammal() {
        return true;
    }
}

// Derived class Cat
class Cat extends Animal {
    public Cat() {
        super("Meow");
    }

    // Cats are mammals
    @Override
    public boolean isMammal() {
        return true;
    }
}

// Derived class Dog
class Dog extends Animal {
    public Dog() {
        super("Woof Woof");
    }

    // Dogs are mammals
    @Override
    public boolean isMammal() {
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of animal (Cat/Dog): ");
        String animalType = scanner.nextLine().trim();

        Animal animal = null;

        if (animalType.equalsIgnoreCase("Cat")) {
            animal = new Cat();
        } else if (animalType.equalsIgnoreCase("Dog")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid animal type.");
            return;
        }

        System.out.print("Is the animal a mammal? ");
        boolean isMammal = animal.isMammal();
        System.out.println(isMammal ? "Yes" : "No");

        System.out.print("The sound of the " + animalType + " is: ");
        animal.sound();
    }
}
