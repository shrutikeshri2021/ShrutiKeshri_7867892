class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal baseObj = new Animal();
        Dog childObj = new Dog();

        baseObj.makeSound();
        childObj.makeSound();
    }
}